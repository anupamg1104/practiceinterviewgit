package com.threadpractice;

/*
 * TOPIC: DEADLOCK IN JAVA
 *
 * Definition:
 * Deadlock is a situation in multithreading where two or more threads wait
 * forever for locks held by each other. As a result, none of the threads
 * can continue.
 *
 * Simple example:
 * - Thread 1 gets lock1 and then waits for lock2.
 * - Thread 2 gets lock2 and then waits for lock1.
 * - Thread 1 cannot get lock2 because Thread 2 owns it.
 * - Thread 2 cannot get lock1 because Thread 1 owns it.
 * - Both threads wait forever: this is deadlock.
 *
 * IMPORTANT:
 * This example uses CountDownLatch to make the deadlock happen reliably.
 * Without the latch, the same lock-order example might deadlock, but it
 * might also finish normally depending on thread scheduling.
 *
 * HOW TO AVOID THIS DEADLOCK:
 * Always acquire locks in the same order in every thread.
 * For example, make both threads acquire lock1 first and lock2 second.
 */

import java.util.concurrent.CountDownLatch;

public class _06DeadlockExample {

    // These are the two shared lock objects.
    private static final Object lock1 = new Object();
    private static final Object lock2 = new Object();

    // Both threads must acquire their first lock before either continues.
    private static final CountDownLatch bothThreadsHaveFirstLock =
            new CountDownLatch(2);

    public static void main(String[] args) {

        // Thread 1: acquires lock1 first, then tries to acquire lock2.
        Thread t1 = new Thread(() -> {

            synchronized (lock1) {
                System.out.println("Thread 1 acquired lock1");

                // Tell the latch that Thread 1 has acquired its first lock.
                bothThreadsHaveFirstLock.countDown();

                try {
                    // Wait until both threads have acquired their first lock.
                    bothThreadsHaveFirstLock.await();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }

                System.out.println("Thread 1 is waiting for lock2");

                synchronized (lock2) {
                    // This line is not reached in this deadlock example.
                    System.out.println("Thread 1 acquired lock2");
                }
            }
        });

        // Thread 2: acquires lock2 first, then tries to acquire lock1.
        Thread t2 = new Thread(() -> {

            synchronized (lock2) {
                System.out.println("Thread 2 acquired lock2");

                // Tell the latch that Thread 2 has acquired its first lock.
                bothThreadsHaveFirstLock.countDown();

                try {
                    // Wait until both threads have acquired their first lock.
                    bothThreadsHaveFirstLock.await();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }

                System.out.println("Thread 2 is waiting for lock1");

                synchronized (lock1) {
                    // This line is not reached in this deadlock example.
                    System.out.println("Thread 2 acquired lock1");
                }
            }
        });

        t1.start();
        t2.start();
    }
}

/*
 * EXPECTED BEHAVIOUR:
 *
 * You should see messages showing:
 * - Thread 1 acquired lock1
 * - Thread 2 acquired lock2
 * - Thread 1 is waiting for lock2
 * - Thread 2 is waiting for lock1
 *
 * The program then remains stuck because each thread is waiting for the
 * lock held by the other thread. Stop the program manually.
 *
 * NOTE:
 * CountDownLatch is only used here to coordinate the demonstration.
 * The actual deadlock is caused by the two threads acquiring the locks
 * in opposite orders.
 */

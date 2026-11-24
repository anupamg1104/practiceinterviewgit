package com.threadpractice;

/*
 * THREAD PRIORITY IN JAVA
 *
 * Thread priority is a number that gives the thread scheduler a hint
 * about the relative importance of a thread.
 *
 * Java priorities range from 1 to 10:
 * Thread.MIN_PRIORITY  = 1  (lowest)
 * Thread.NORM_PRIORITY = 5  (default)
 * Thread.MAX_PRIORITY  = 10 (highest)
 *
 * setPriority(number) sets a thread's priority.
 * getPriority() reads a thread's priority.
 *
 * IMPORTANT:
 * - A new thread normally inherits the priority of its creator.
 * - Set priority before start() for this demonstration.
 * - Higher priority does NOT guarantee that a thread runs first.
 * - Actual scheduling depends on the JVM and operating system.
 * - Priority is a scheduling hint, not a guarantee.
 */

public class _08ThreadPriorityExample {

    public static void main(String[] args) {

        // Create three thread objects.
        Thread low = new Thread(() -> {
            System.out.println(Thread.currentThread().getName()
                    + " is running. Priority: "
                    + Thread.currentThread().getPriority());
        }, "Low-Priority-Thread");

        Thread normal = new Thread(() -> {
            System.out.println(Thread.currentThread().getName()
                    + " is running. Priority: "
                    + Thread.currentThread().getPriority());
        }, "Normal-Priority-Thread");

        Thread high = new Thread(() -> {
            System.out.println(Thread.currentThread().getName()
                    + " is running. Priority: "
                    + Thread.currentThread().getPriority());
        }, "High-Priority-Thread");

        // Set priorities BEFORE starting the threads.
        low.setPriority(Thread.MIN_PRIORITY);       // 1
        normal.setPriority(Thread.NORM_PRIORITY);   // 5
        high.setPriority(Thread.MAX_PRIORITY);      // 10

        // Read and print the priorities.
        System.out.println("Low priority: " + low.getPriority());
        System.out.println("Normal priority: " + normal.getPriority());
        System.out.println("High priority: " + high.getPriority());

        System.out.println("\\nStarting all threads...");

        // Start all three threads.
        low.start();
        normal.start();
        high.start();
    }
}

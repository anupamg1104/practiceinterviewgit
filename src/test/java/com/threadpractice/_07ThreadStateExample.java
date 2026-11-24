package com.threadpractice;

/*
 * Java Thread State Demonstration
 *
 * IMPORTANT:
 * Java does NOT have separate Thread.State values named STARTED, WAIT,
 * SLEEP, or NOTIFY.
 *
 * The official Java thread states are:
 * 1. NEW            - Thread object is created, but start() has not been called.
 * 2. RUNNABLE       - Thread is running or ready to run after start().
 * 3. BLOCKED        - Thread is waiting to acquire a synchronized monitor lock.
 * 4. WAITING        - Thread is waiting indefinitely, for example inside wait().
 * 5. TIMED_WAITING  - Thread is waiting for a specified time, for example sleep().
 * 6. TERMINATED     - Thread has finished execution.
 *
 * start()   -> normally moves NEW to RUNNABLE
 * wait()    -> moves the calling thread to WAITING
 * sleep()   -> moves the calling thread to TIMED_WAITING
 * notify()  -> wakes a thread waiting on the same object's monitor.
 *              notify() itself is NOT a thread state. The awakened thread
 *              must reacquire the monitor before it can continue.
 * run() ends -> TERMINATED
 *
 * Run this class and observe the printed states.
 */

public class _07ThreadStateExample {

    // Both main and worker use this same object for wait() and notify().
    private static final Object monitor = new Object();

    // Main uses this flag to know when the worker is about to call wait().
    private static volatile boolean readyToWait = false;

    public static void main(String[] args) throws InterruptedException {

        // 1. Create a thread. It is in NEW state.
        Thread worker = new Thread(() -> {
            System.out.println("Worker: run() started.");

            synchronized (monitor) {
                try {
                    // Tell main that the worker is ready to call wait().
                    readyToWait = true;

                    System.out.println("Worker: calling wait() now.");

                    // 2. wait() releases monitor and puts worker in WAITING.
                    monitor.wait();

                    // This line runs only after another thread calls notify()
                    // and this worker successfully reacquires the monitor.
                    System.out.println("Worker: received notification and continued.");

                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    System.out.println("Worker: interrupted while waiting.");
                    return;
                }
            }

            try {
                System.out.println("Worker: calling sleep() for 3 seconds.");

                // 3. sleep() puts worker in TIMED_WAITING.
                // Unlike wait(), sleep() does NOT release any monitor lock.
                Thread.sleep(3000);

            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Worker: interrupted while sleeping.");
                return;
            }

            System.out.println("Worker: run() is finishing.");
        }, "Worker");

        System.out.println("1. Before start(): " + worker.getState());
        // Expected: NEW

        // 4. start() asks JVM to schedule the new thread.
        worker.start();

        // Wait until worker has reached the point just before wait().
        while (!readyToWait) {
            Thread.yield();
        }

        // Wait until the worker's actual state becomes WAITING.
        waitForState(worker, Thread.State.WAITING);
        System.out.println("2. After worker calls wait(): " + worker.getState());
        // Expected: WAITING

        // 5. Notify the waiting worker while holding the same monitor.
        synchronized (monitor) {
            System.out.println("Main: calling notify().");
            monitor.notify();
            // The worker is notified, but cannot continue until main exits
            // this synchronized block and releases monitor.
        }

        // Wait until worker starts sleeping.
        waitForState(worker, Thread.State.TIMED_WAITING);
        System.out.println("3. While worker calls sleep(): " + worker.getState());
        // Expected: TIMED_WAITING

        // 6. Wait for worker's run() method to finish.
        worker.join();

        System.out.println("4. After run() finishes: " + worker.getState());
        // Expected: TERMINATED
    }

    /*
     * Helper method:
     * Waits until the thread reaches the expected state.
     * The timeout prevents this demonstration from waiting forever
     * if something unexpected happens.
     */
    private static void waitForState(Thread thread, Thread.State expectedState)
            throws InterruptedException {

        long timeoutInMillis = 5000;
        long startTime = System.currentTimeMillis();

        while (thread.getState() != expectedState) {
            if (System.currentTimeMillis() - startTime > timeoutInMillis) {
                throw new IllegalStateException(
                        "Thread did not reach state: " + expectedState
                        + ". Current state: " + thread.getState());
            }
            Thread.sleep(10);
        }
    }
}


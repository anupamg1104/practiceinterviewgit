package com.threadpractice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * THREAD POOL IN JAVA
 *
 * DEFINITION:
 * A thread pool is a group of reusable worker threads.
 * We submit tasks to the pool instead of creating a new Thread for every task.
 *
 * REAL-LIFE EXAMPLE:
 * Imagine a restaurant with 3 waiters and 6 customers.
 *
 * - The 3 waiters are like the 3 worker threads.
 * - The 6 customers' orders are like the 6 tasks.
 * - Initially, 3 waiters handle 3 orders.
 * - The other 3 orders wait.
 * - When a waiter finishes an order, that waiter takes the next waiting order.
 *
 * PROGRAM WALKTHROUGH:
 *
 * ExecutorService pool = Executors.newFixedThreadPool(3);
 * This creates a pool that can run at most 3 tasks at the same time.
 *
 * We submit 6 tasks:
 *   Task 1, Task 2, Task 3, Task 4, Task 5, Task 6
 *
 * A possible execution (the exact order is NOT guaranteed):
 *
 *   Worker-1 -> Task 1
 *   Worker-2 -> Task 2
 *   Worker-3 -> Task 3
 *
 * Suppose Worker-2 finishes Task 2 first:
 *
 *   Worker-2 -> Task 4
 *
 * Then suppose Worker-1 finishes Task 1:
 *
 *   Worker-1 -> Task 5
 *
 * Then suppose Worker-3 finishes Task 3:
 *
 *   Worker-3 -> Task 6
 *
 * Notice:
 * - We created only 3 worker threads.
 * - We submitted 6 tasks.
 * - The same worker threads are reused for more than one task.
 * - The order and timing depend on the scheduler and task duration.
 *
 * IMPORTANT METHODS:
 * newFixedThreadPool(3) -> creates a pool with 3 worker threads.
 * submit(task)          -> sends a task to the pool.
 * shutdown()            -> stops accepting new tasks, but lets submitted
 *                          tasks finish.
 * awaitTermination()    -> lets the main thread wait for pool completion.
 */

public class _09ThreadPoolExample {

    public static void main(String[] args) {

        // STEP 1: Create a pool containing 3 worker threads.
        ExecutorService pool = Executors.newFixedThreadPool(3);

        // STEP 2: Submit 6 tasks to the pool.
        for (int i = 1; i <= 6; i++) {

            // Store the current task number for use inside the lambda.
            final int taskNumber = i;

            pool.submit(() -> {

                // Find the name of the worker thread executing this task.
                String threadName = Thread.currentThread().getName();

                System.out.println("Task " + taskNumber
                        + " STARTED by " + threadName);

                try {
                    // Pretend that this task takes 2 seconds to complete.
                    // While this task is sleeping, its worker cannot take
                    // another task.
                    Thread.sleep(2000);

                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    System.out.println("Task " + taskNumber + " was interrupted.");
                    return;
                }

                System.out.println("Task " + taskNumber
                        + " COMPLETED by " + threadName);
            });
        }

        // STEP 3: Tell the pool that we will not submit any more tasks.
        // Tasks already submitted will still execute and complete.
        pool.shutdown();

        // STEP 4: Wait until all submitted tasks have completed.
        try {
            boolean finished = pool.awaitTermination(1,
                    java.util.concurrent.TimeUnit.MINUTES);

            if (finished) {
                System.out.println("All tasks have completed.");
            } else {
                System.out.println("Tasks did not finish within one minute.");
            }

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Main thread was interrupted while waiting.");
        }
    }
}

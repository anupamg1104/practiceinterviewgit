
package com.threadpractice;

public class _05NotifyAllExample1 {

    public static void main(String[] args) throws InterruptedException {

        B3 b1 = new B3();

        Thread t1 = new Thread(b1, "Thread-1");
        Thread t2 = new Thread(b1, "Thread-2");
        Thread t3 = new Thread(b1, "Thread-3");

        t1.start();
        t2.start();
        t3.start();

        // Wait until all three threads are waiting
        synchronized (b1) {
            while (b1.waitingCount < 3) {
                b1.wait();
            }

            System.out.println("Main thread: Notifying all threads");

            b1.notifyAll();
        }

        t1.join();
        t2.join();
        t3.join();

        System.out.println("All threads completed.");
    }
}

class B3 implements Runnable {

    int balance;
    int waitingCount = 0;

    public void run() {

        synchronized (this) {

            waitingCount++;

            System.out.println(
                Thread.currentThread().getName() + " is waiting"
            );

            // Notify main thread that another thread is waiting
            notifyAll();

            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }

        System.out.println(
            Thread.currentThread().getName() + " is notified"
        );

        // Each thread performs its own calculation
        for (int i = 0; i < 10000; i++) {
            balance = balance + i;
        }
    }
}

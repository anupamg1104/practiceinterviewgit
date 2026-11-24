
package com.threadpractice;

public class _05NotifyAllExample {

    public static void main(String[] args) throws InterruptedException {

        Result result = new Result();

        Thread t1 = new Thread(() -> result.checkResult(), "Student-1");
        Thread t2 = new Thread(() -> result.checkResult(), "Student-2");
        Thread t3 = new Thread(() -> result.checkResult(), "Student-3");

        t1.start();
        t2.start();
        t3.start();

        // Give students time to start waiting
        Thread.sleep(5000);

        result.announceResult();

    }
}

class Result {

    boolean isResultDeclared = false;

    public synchronized void checkResult() {

        while (!isResultDeclared) {

            try {
                System.out.println(
                    Thread.currentThread().getName() + " is waiting..."
                );

                wait();

            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }

        System.out.println(
            Thread.currentThread().getName() + " received the result!"
        );
    }

    public synchronized void announceResult() {

        isResultDeclared = true;

        System.out.println("Teacher announced the result!");

        notifyAll();
    }
}

/*
 * notify():
 * Wakes up one thread waiting on the object's monitor.
 *
 * notifyAll():
 * Wakes up all threads waiting on the object's monitor.
 *
 * IMPORTANT:
 * 1. Both must be called inside synchronized.
 * 2. Both work on the same object's monitor.
 * 3. Notified threads cannot continue until they
 *    reacquire the monitor.
 * 4. Always use while with wait() to recheck conditions.
 * 5. notifyAll() does not mean all threads execute
 *    simultaneously.
 */
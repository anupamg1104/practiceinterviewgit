package com.threadpractice;

public class _04CorrectThreadMethod2updated {
	public static void main(String[] args) {

		B2 b1 = new B2();

		synchronized (b1) {

			b1.start();

			// Main thread waits until notified
			try {
				b1.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println(b1.balance);
	}
}

class B2 extends Thread {

	int balance;

	public void run() {

		for (int i = 0; i < 10000; i++) {
			balance = balance + i;
		}

		synchronized (this) {
			this.notify();
		}
	}
}


/*
 * INTER-THREAD COMMUNICATION USING WAIT() AND NOTIFY()
 *
 * 1. wait() makes the main thread wait until another thread
 *    notifies it.
 *
 * 2. notify() wakes up one thread waiting on the same object.
 *
 * 3. Both wait() and notify() must be called inside a
 *    synchronized block or method.
 *
 * 4. wait() releases the object's lock while waiting.
 *
 * 5. notify() does not immediately release the lock.
 *    The waiting thread resumes after the notifying thread
 *    releases the lock.
 *
 * 6. Here, main thread calls wait() on b1.
 *    The child thread completes its calculation and calls notify().
 *
 * 7. After notification, main thread continues execution
 *    and prints the final balance.
 *
 * IMPORTANT:
 * join() is simpler when we only want to wait for a thread
 * to complete.
 *
 * wait() and notify() are useful for inter-thread
 * communication, such as Producer-Consumer problems.
 */


/*
   public void run() {

       for (int i = 0; i < 10000; i++) {
           balance = balance + i;
       }

       notify();  // IllegalMonitorStateException
   }
 */


/*
 * Exception: IllegalMonitorStateException
 *
 * Reason:
 * Calling wait(), notify(), or notifyAll() without
 * owning the object's monitor (lock).
 *
 * Solution:
 * Call these methods inside a synchronized block or method
 * using the SAME object whose monitor is required.
 *
 * Example:
 * synchronized (this) {
 *     notify();
 * }
 *
 * Important:
 * wait() releases the object's lock.
 * notify() does not immediately release the lock.
 */


//start() – Starts a new thread.
//join() – Waits for thread completion.
//sleep() – Pauses the current thread.
//wait() – Waits and releases the monitor.
//notify() – Wakes one waiting thread.
//notifyAll() – Wakes all waiting threads.
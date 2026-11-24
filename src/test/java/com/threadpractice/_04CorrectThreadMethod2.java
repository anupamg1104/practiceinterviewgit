package com.threadpractice;

public class _04CorrectThreadMethod2 {

	public static void main(String[] args) {

		B1 b1 = new B1();

		b1.start();

		try {
			b1.join();  // Main thread waits for child thread
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(b1.balance);
	}
}

class B1 extends Thread {

	int balance;

	public void run() {

		for (int i = 0; i < 10000; i++) {
			balance = balance + i;
		}
	}
}


/*
Problem: Main thread does not wait for child thread.

After calling start(), the main thread immediately executes
the next statement and may print balance before run() finishes.

Solution: Use join() to make the main thread wait until
the child thread completes execution.

Important:
start() -> Starts a new thread.
run()   -> Contains thread execution logic.
join()  -> Waits for the thread to complete.
 */



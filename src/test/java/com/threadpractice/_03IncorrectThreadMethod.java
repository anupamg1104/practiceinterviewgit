package com.threadpractice;

public class _03IncorrectThreadMethod {
	public static void main(String[] args) {
      B b1=new B();
      b1.start();
      System.out.println(b1.balance);
	}
}


 class B extends Thread{
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



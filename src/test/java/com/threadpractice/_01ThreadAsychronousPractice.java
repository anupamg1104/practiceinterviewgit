package com.threadpractice;

public class _01ThreadAsychronousPractice {
	int balance;
	public static void main(String[] args) {
		_01ThreadAsychronousPractice a1=new _01ThreadAsychronousPractice();
		a1.account();
		System.out.println(a1.balance);
	}
	private void account() {
		Thread t1=new Thread(new Runnable() {
			@Override
			public void run() {
				add();
			}
		});

		Thread t2=new Thread(new Runnable() {
			@Override
			public void run() {
				sub();
			}
		});
		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	protected void sub() {
		for(int i=0;i<1000;i++) {
			balance=balance-i;
		}
	}
	protected void add() {
		for(int i=0;i<1000;i++) {
			balance=balance+i;
		}
	}

}

/*
Problem: Race Condition

Both threads (t1 and t2) access and modify the same 
shared variable (balance) simultaneously.

Because balance++ / balance-- operations are not atomic,
 one thread's update can be overwritten by another thread,
 causing incorrect or unpredictable results.

Solution: Use synchronized or AtomicInteger to make updates thread-safe.

Note: join() only makes the main thread wait for both threads to finish; it does not prevent race conditions.
*/




//join() makes the main thread wait until both worker threads finish execution.
//Without join(), the main thread might print the balance before the worker threads finish.

//Important: join() does not prevent race conditions. 
//It only ensures that the main thread waits for completion.
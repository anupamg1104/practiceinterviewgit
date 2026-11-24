package com.threadpractice;

public class _02ThreadSychronousPracticeUpdated {

    int balance;

    public static void main(String[] args) {

    	_02ThreadSychronousPracticeUpdated a1 = new _02ThreadSychronousPracticeUpdated();

        a1.account();

        System.out.println(a1.balance);
    }

    private void account() {

//    	Old approach (Anonymous Inner Class):
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                add();
            }
        });
        
//        New approach (Lambda Expression):
//        Thread t1 = new Thread(() -> add());
        
//        using method references:
//        Thread t1 = new Thread(this::add);
//        Thread t2 = new Thread(this::sub);

        Thread t2 = new Thread(new Runnable() {
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
            e.printStackTrace();
        }
    }

    /*
     * synchronized prevents race conditions.
     * Only one thread can execute add() or sub()
     * at a time on the same object.
     */
    protected synchronized void sub() {

        for (int i = 0; i < 1000; i++) {
            balance = balance - i;
        }
    }

    protected synchronized void add() {

        for (int i = 0; i < 1000; i++) {
            balance = balance + i;
        }
    }
}

/*
 * IMPORTANT NOTES:
 *
 * 1. Both threads access the same shared variable (balance).
 *
 * 2. Without synchronization, a race condition can occur.
 *
 * 3. Race condition means multiple threads modify shared data
 *    simultaneously, causing unpredictable results.
 *
 * 4. synchronized provides mutual exclusion.
 *
 * 5. join() makes the main thread wait until both threads finish.
 *
 * 6. join() does not prevent race conditions.
 *
 * Expected output: 0
 */

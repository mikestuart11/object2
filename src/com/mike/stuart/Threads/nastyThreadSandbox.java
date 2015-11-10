package com.mike.stuart.Threads;

/**
 * Created by Mike on 11/10/2015.
 */
public class nastyThreadSandbox extends Thread {

    public static String lock1 = "String 1";
    public static String lock2 = "String 2";

    Thread thread1 = new Thread() {
        public void run() {
            synchronized (lock1) {
                System.out.println("Thread 1: Holding String 1");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 1: Waiting for String 1");
                synchronized (lock2) {
                    System.out.println("Thread 1: Holding for Strings 1 & 2");
                }
            }

        }
    };

    Thread thread2 = new Thread() {
        public void run() {
            synchronized (lock2) {
                System.out.println("Thread 2: Holding String 1");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 2: Waiting for String 1");
                synchronized (lock1) {
                    System.out.println("Thread 2: Holding for Strings 1 & 2");
                }
            }

        }
    };

    public static void main(String args[]) {

        nastyThreadSandbox nastyThread1 = new nastyThreadSandbox();
        nastyThreadSandbox nastyThread2 = new nastyThreadSandbox();

        nastyThread1.thread1.start();
        nastyThread2.thread2.start();

    }
}

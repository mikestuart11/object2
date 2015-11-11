package com.mike.stuart.Threads;

/**
 * Created by Mike on 11/11/2015.
 */
public class secondRunnableSandbox implements Runnable {
    public void run() {
        for (int i = 0; i < 3; i++) {
            try {
                System.out.println("Second RunnableSandbox is running.");
                Thread.currentThread().sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

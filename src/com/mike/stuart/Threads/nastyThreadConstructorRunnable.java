package com.mike.stuart.Threads;

/**
 * Created by Mike on 11/11/2015.
 */
public class nastyThreadConstructorRunnable {

    public static void main(String args[]) {
        runnableSandbox nullRunnable = null;

        Thread testNullThread = new Thread(nullRunnable);
        testNullThread.start();
    } // nothing happens at all
}

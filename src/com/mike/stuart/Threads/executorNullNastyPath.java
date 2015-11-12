package com.mike.stuart.Threads;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * Created by Mike on 11/12/2015.
 */
public class executorNullNastyPath {
    public static void main(String[] args) {
        Executor myThirdExecutor = Executors.newCachedThreadPool();
        System.out.println("-----------------------Begin First Thread----------------------------------");
        for (int i = 0; i < 5; i++) {
            try {
                Thread.currentThread().sleep(10);
                runnableSandbox myNullRunnable = null;
                myThirdExecutor.execute(myNullRunnable);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } // this passes a java.lang.NullPointerException
        }
    }
}

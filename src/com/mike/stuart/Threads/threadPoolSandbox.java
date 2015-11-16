package com.mike.stuart.Threads;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * Created by Mike on 11/11/2015.
 */
public class threadPoolSandbox {

    public static void main(String[] args) {
        System.out.println("-----------------------Begin First Thread----------------------------------");
        Executor mySecondExecutor = Executors.newCachedThreadPool();


        mySecondExecutor.execute(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    try {
                        Thread.currentThread().sleep(10);
                        System.out.println("First Thread Done Sleeping");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

        });
        mySecondExecutor.execute(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    try {
                        Thread.currentThread().sleep(10);
                        System.out.println("First Thread Done Sleeping");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

        });
    }

}



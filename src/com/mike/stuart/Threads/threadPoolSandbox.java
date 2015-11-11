package com.mike.stuart.Threads;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * Created by Mike on 11/11/2015.
 */
public class threadPoolSandbox {

    public static void main(String[] args) {
        Executor mySecondExecutor = Executors.newCachedThreadPool();
        System.out.println("-----------------------Begin First Thread----------------------------------");
        for (int i = 0; i < 5; i++) {
            try {
                Thread.currentThread().sleep(10);
                System.out.println("First Thread Done Sleeping");
                runnableSandbox myRunnable = new runnableSandbox();
                mySecondExecutor.execute(myRunnable);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        try {
            Thread.currentThread().sleep(10);
            System.out.println("-----------------------Second Thread Done Sleeping----------------------------------");
            for (int j = 0; j < 5; j++) {
                secondRunnableSandbox mySecondRunnable = new secondRunnableSandbox();
                mySecondExecutor.execute(mySecondRunnable);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

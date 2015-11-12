package com.mike.stuart.Threads;

/**
 * Created by Mike on 11/12/2015.
 */
public class raceConditionSandbox {

    public int count = 0;

    public void countingMachine() {
        count++;
    }

    Thread thread3 = new Thread() {
        @Override
        public void run() {
            for (int i = 0; i < 50; i++){
                countingMachine();
//                count++;
                System.out.println("1st Thread: " + count);
            }
        }
    };

    Thread thread4 = new Thread() {
        public void run() {
            for (int i = 0; i < 50; i++) {
                countingMachine();
//                count++;
                System.out.println("2nd Thread: " + count);
            }
        }
    };

    public static void main(String args[]) {

        raceConditionSandbox myThread1 = new raceConditionSandbox();

        myThread1.thread3.start();
        myThread1.thread4.start();

    }
}

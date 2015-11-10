package com.mike.stuart.Threads;

/**
 * Created by Mike on 11/9/2015.
 */
public class threadsSandbox extends Thread {

    Thread thread1 = new Thread() {
      public void run() {
          for (int i = 0; i < 5; i++){
              System.out.println("1st Thread Working");
              try {
                  thread2.join();
                  thread1.sleep(100);
              } catch (InterruptedException e) {
                  e.printStackTrace();
              }
          }
      }
    };

    Thread thread2 = new Thread() {
        public void run() {
            for (int i = 0; i < 6; i++) {
                System.out.println("2nd Thread Working");
                try {
                    thread1.join();
                    thread2.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    };

    public static void main(String args[]) {
        // Happy Thead 1 -----------------------------------------------------------------------------------------------
        System.out.println("Happy Stuff");
        threadsSandbox myThread1 = new threadsSandbox();
        threadsSandbox myThread2 = new threadsSandbox();

        myThread1.thread1.start();
        myThread2.thread2.start();

    }

}

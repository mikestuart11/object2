package mike.stuart.Threads;

/**
 * Created by Mike on 11/10/2015.
 */
public class runnableSandbox implements Runnable {
    public void run() {
        for (int i = 0; i < 3; i++) {
            try {
                System.out.println("RunnableSandbox is running.");
                Thread.currentThread().sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

package baitap.thread;

public class EvenThread implements Runnable {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                if (i % 2 == 0) {
                    System.out.println("Even: " + i);
                    Thread.sleep(1000);
                }
            }
        } catch (InterruptedException e) {
            e.getMessage();
        }
        System.out.println("my thread run is over");
    }
}

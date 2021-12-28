package baitap.numbergenerator;

public class NumberGenerator implements Runnable {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Number" + i);
                System.out.println("Hash Code of number " + i + ": " + hashCode());
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("my thread interrupted");
        }
        System.out.println("my thread run is over");
    }
}

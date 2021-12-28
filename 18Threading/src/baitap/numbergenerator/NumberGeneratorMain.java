package baitap.numbergenerator;

import baitap.numbergenerator.NumberGenerator;

public class NumberGeneratorMain {
    public static void main(String[] args) {
        NumberGenerator numberGenerator = new NumberGenerator();

        Thread thread1 = new Thread(numberGenerator);
        Thread thread2 = new Thread(numberGenerator);

        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.MIN_PRIORITY);
        thread1.start();
        thread2.start();
    }



}

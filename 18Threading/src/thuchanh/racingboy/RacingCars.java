package thuchanh.racingboy;

import java.util.Random;

import static thuchanh.racingboy.RacingCarsMain.DISTANCE;
import static thuchanh.racingboy.RacingCarsMain.STEP;

public class RacingCars implements Runnable {
    private String name;

    RacingCars(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        int runDistance = 0;
        long startTime = System.currentTimeMillis();

        while (runDistance < DISTANCE) {
            try {
                int speed = new Random().nextInt(10);
                runDistance += speed;
                StringBuilder log = new StringBuilder("|");
                int percentTravel = (runDistance * 100) / DISTANCE;
                for (int i = 0; i < DISTANCE; i += STEP) {
                    if (percentTravel >= i + STEP) {
                        log.append("~");
                    } else if (percentTravel >= i && percentTravel < i + STEP) {
                        log.append("o");
                    } else {
                        log.append("-");
                    }
                }
                log.append("|");
                System.out.println("Car" + this.name + ": " + log + " " + Math.min(DISTANCE, runDistance) + "KM");
                Thread.sleep(800);
            } catch (InterruptedException e) {
                System.out.println("Car " + this.name + "broken...");
                break;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Car " + this.name + " Finish in " + (endTime - startTime) / 1000 + "s");
    }
}

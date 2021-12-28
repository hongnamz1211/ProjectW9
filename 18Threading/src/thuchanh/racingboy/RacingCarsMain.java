package thuchanh.racingboy;

import thuchanh.racingboy.RacingCars;

public class RacingCarsMain {
    public static int DISTANCE = 100;
    public static int STEP = 2;

    public static void main(String[] args) {
        RacingCars racingCars1 = new RacingCars("A");
        RacingCars racingCars2 = new RacingCars("B");
        RacingCars racingCars3 = new RacingCars("C");

        Thread thread1 = new Thread(racingCars1);
        Thread thread2 = new Thread(racingCars2);
        Thread thread3 = new Thread(racingCars3);

        System.out.println("Distance = 1000km");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

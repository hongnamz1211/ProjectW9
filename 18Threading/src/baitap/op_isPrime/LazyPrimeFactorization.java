package baitap.op_isPrime;

public class LazyPrimeFactorization implements Runnable{

    public boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number) ; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void run() {
        System.out.println("Số nguyên tố nhỏ hơn 100");
        long startTime = System.currentTimeMillis();
        try {
            for (int i = 1; i < 100; i++) {
                if (isPrime(i))
                    System.out.println(i);
            }
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("LazyPrime " + (endTime - startTime) + "ms");
    }
}

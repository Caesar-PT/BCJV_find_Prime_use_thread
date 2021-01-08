public class LazyPrimeFactorization implements Runnable{
    @Override
    public void run() {
        int number = 2;
        while (number < 100) {
            boolean check = true;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check)
                System.out.print("Lazy: " + number + "\n");
            number++;
        }
    }
}

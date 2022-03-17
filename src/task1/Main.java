package task1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long k = scanner.nextLong();
        int n = scanner.nextInt();
        double m = scanner.nextDouble();
        Random random;
        boolean ok = true;
        int counter = 0;

        while (ok) {
            random = new Random(k);
            for (int i = 0; i < n; i++) {
                if (random.nextGaussian() > m) {
                    k += 1;
                    break;
                }
                counter += 1;
            }
            if (counter == n) {
                System.out.println(k);
                ok = false;
            } else {
                counter = 0;
            }
        }

    }
}


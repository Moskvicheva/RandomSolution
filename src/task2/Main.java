package task2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        long findSeed = 0;
        int max = k;
        for (long seed = a; seed <= b; seed++) {
            int curMax = 0;
            Random r = new Random(seed);
            for (int i = 0; i < n; i++) {
                int num = r.nextInt(k);
                if (num > curMax) {
                    curMax = num;
                }
            }
            if (curMax < max) {
                max = curMax;
                findSeed = seed;
            }
        }
        System.out.println(findSeed);
        System.out.println(max);
    }
}

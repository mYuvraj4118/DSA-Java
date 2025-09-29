// Program to calculate prime numbers from 2 to certain range given by the user.

import java.util.*;

public class PrimesInRange {
    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void rangePrime(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range: ");
        int limit = sc.nextInt();

        System.out.println("The numbers are: ");
        rangePrime(limit);
        sc.close();
    }
}

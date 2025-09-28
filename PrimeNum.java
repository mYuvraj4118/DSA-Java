// Program to find whether a number is prime or not

import java.util.*;

public class PrimeNum {
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to find out if it is prime or not: ");
        int n = sc.nextInt();

        System.out.print(isPrime(n));
        sc.close();

    }
}

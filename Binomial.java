// Program to calculate Binomial Coefficient using java

import java.util.*;

public class Binomial {

    public static long factorial(int num) {
        long f = 1;
        for (int i = 1; i <= num; i++) {
            f = f * i;
        }
        return f;
    }

    public static long binCoeff(int n, int r) {
        long fact_n = factorial(n);
        long fact_r = factorial(r);
        long fact_nmr = factorial(n - r);

        long binCoeff = fact_n / (fact_r * fact_nmr);
        return binCoeff;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.print("Enter the value of r: ");
        int r = sc.nextInt();
        System.out.println(binCoeff(n, r));
        sc.close();
    }
}

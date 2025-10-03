// Program to print 0-1 triangle pattern in java

import java.util.*;

public class ZeroOneTriangle {
    public static void zero_one_triangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of lines to print: ");
        int n = sc.nextInt();
        sc.close();

        zero_one_triangle(n);
    }
}

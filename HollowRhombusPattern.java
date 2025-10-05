// Program to print hollow rhombus using stars in java

import java.util.Scanner;

public class HollowRhombusPattern {
    public static void hollow_rhombus(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("x");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the rhombus: ");
        int size = sc.nextInt();
        sc.close();
        hollow_rhombus(size);
    }
}

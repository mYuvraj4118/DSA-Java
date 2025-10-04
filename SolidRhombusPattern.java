// Program to print solid rhombus pattern using stars in java

import java.util.*;

public class SolidRhombusPattern {
    public static void solid_rhombus(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of rhombus: ");
        int size = sc.nextInt();
        sc.close();
        solid_rhombus(size);
    }
}

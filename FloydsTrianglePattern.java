// Program to print Floyd's Triangle pattern in java

import java.util.*;

public class FloydsTrianglePattern {
    public static void floyds_triangle(int n) {
        int counter = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of lines to print: ");
        int n = sc.nextInt();
        sc.close();

        floyds_triangle(n);
    }
}

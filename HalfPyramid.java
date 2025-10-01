// Program to print half pyramid pattern using numbers

import java.util.*;

public class HalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of lines to print: ");
        int n = sc.nextInt();

        for (int line = 1; line <= n; line++) {
            for (int number = 1; number <= line; number++) {
                System.out.print(number);
            }

            System.out.println();
        }

        sc.close();
    }
}

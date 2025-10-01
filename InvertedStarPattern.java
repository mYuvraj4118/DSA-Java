// Program to print inverted star pattern

import java.util.*;

public class InvertedStarPattern {
    public static void main(String[] args) {
        System.out.print("Enter the number of lines of stars: ");
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();

        for (int line = 1; line <= limit; line++) {
            for (int star = 1; star <= limit - line + 1; star++) {
                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();
    }
}

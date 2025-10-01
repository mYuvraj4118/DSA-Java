// Program to print star pattern

import java.util.*;

public class StarPattern {
    public static void main(String[] args) {
        System.out.print("Enter the number of lines of stars: ");
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();

        for (int line = 1; line <= limit; line++) {
            for (int star = 1; star <= line; star++) {
                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();
    }
}

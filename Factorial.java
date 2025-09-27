// Calculates factorial of a number in java

import java.util.*;

public class Factorial {
    public static int fact(int num) {
        int f = 1;
        for (int i = 1; i <= num; i++) {
            f = f * i;
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to find the factorial of: ");
        int num = sc.nextInt();

        System.out.println("The factorial of the given number is: " + fact(num));

        sc.close();
    }

}

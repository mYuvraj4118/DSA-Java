// Code to reverse a given number in Java

import java.util.*;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to reverse : ");
        int n = sc.nextInt();

        while (n > 0) {
            int lastDigit = n % 10;
            System.out.print(lastDigit + "");
            n = n / 10;
        }
        sc.close();
    }
}

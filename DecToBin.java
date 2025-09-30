// Program to covert numbers in decimal form to binary form.

import java.util.*;

public class DecToBin {

    public static void binToDec(int decNum) {
        int myNum = decNum;
        int pow = 0;
        int binNum = 0;

        while (decNum > 0) {
            int rem = decNum % 2;
            binNum = binNum + (rem * (int) Math.pow(10, pow));

            pow++;
            decNum = decNum / 2;
        }

        System.out.println("The decimal form of: " + myNum + " = " + binNum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number in decimal form to convert to binary form: ");
        int decNum = sc.nextInt();
        sc.close();

        binToDec(decNum);
    }
}

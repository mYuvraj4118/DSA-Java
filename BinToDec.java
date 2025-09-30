// Program to covert numbers in binary form to decimal form.

import java.util.*;

public class BinToDec {

    public static void binToDec(int binNum) {
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;

        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int) Math.pow(2, pow));

            pow++;
            binNum = binNum / 10;
        }

        System.out.println("The decimal form of: " + myNum + " = " + decNum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number in binary form to convert to decimal form: ");
        int binNum = sc.nextInt();
        sc.close();

        binToDec(binNum);
    }
}

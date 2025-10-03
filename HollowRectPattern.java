// Program to print a hallow rectangle using stars in java

import java.util.Scanner;

public class HollowRectPattern {
    public static void hollo_rectangle(int totRows, int totCols) {
        for (int i = 1; i <= totRows; i++) {
            for (int j = 1; j <= totCols; j++) {
                if (i == 1 || i == totRows || j == 1 || j == totCols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int totRows = sc.nextInt();
        System.out.print("Enter the number of coloumns: ");
        int totCols = sc.nextInt();

        hollo_rectangle(totRows, totCols);
        sc.close();
    }
}

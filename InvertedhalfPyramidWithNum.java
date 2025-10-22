/*
 Java code to print inverted and rotated half pyramid with stars
 1 2 3 4 5
 1 2 3 4
 1 2 3 
 1 2
 1
 */

import java.util.Scanner;

public class InvertedhalfPyramidWithNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows:");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

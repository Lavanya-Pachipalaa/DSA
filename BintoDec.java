import java.util.*;

public class BintoDec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter binary number:");
        int binNum = sc.nextInt();
        int n = binNum;
        int power = 0, decimal = 0;
        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decimal = decimal + lastDigit * (int) Math.pow(2, power);
            power++;
            binNum = binNum / 10;
        }
        System.out.println("Decimal of " + n + " is " + decimal);
    }
}
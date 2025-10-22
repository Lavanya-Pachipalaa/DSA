import java.util.*;

public class DectoBin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter decimal number:");
        int n = sc.nextInt();
        int dec = n;
        int power = 0;
        int bin = 0;
        while (n > 0) {
            int rem = n % 2;
            bin = bin + (rem * (int) Math.pow(10, power));

            power++;
            n = n / 2;
        }
        System.out.println("Binary of " + dec + " is " + bin);
        sc.close();
    }
}

package java_code;

import java.util.Scanner;

public class Hello1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int temp = num;
        int digits = 0;
        int sum = 0;

        if (num < 0) {
            System.out.println(num + " is not an Armstrong number.");
            sc.close();
            return;
        }

        // Count the number of digits
        do {
            digits++;
            temp /= 10;
        } while (temp != 0);

        temp = num;

        // Calculate the sum of digits raised to the power
        // of the total number of digits
        do {
            int digit = temp % 10;
            sum += (int) Math.pow(digit, digits);
            temp /= 10;
        } while (temp != 0);

        // Check the result
        if (sum == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is not an Armstrong number.");
        }

        sc.close();
    }
}

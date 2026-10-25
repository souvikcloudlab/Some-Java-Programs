package java_code;

import java.util.Arrays;

public class Hello {
    static boolean isFibonacci(int n) {
        if (n < 0) {
            return false;
        }

        int a = 0, b = 1;

        while (a < n) {
            int temp = a + b;
            a = b;
            b = temp;
        }

        return a == n;
    }
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int[] arr = {1, 4, 5, 8, 10, 13, 15, 21, 25};
        int count = 0;

        // Count Fibonacci numbers
        for (int num : arr) {
            if (isFibonacci(num)) {
                count++;
            }
        }

        // Store Fibonacci numbers in a new array
        int[] fib = new int[count];
        int index = 0;

        for (int num : arr) {
            if (isFibonacci(num)) {
                fib[index++] = num;
            }
        }

        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Number of Fibonacci numbers: " + count);
        System.out.println("Fibonacci Array: " + Arrays.toString(fib));
    }
}

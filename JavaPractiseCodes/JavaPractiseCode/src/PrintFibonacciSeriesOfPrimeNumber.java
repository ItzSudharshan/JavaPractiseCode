import java.util.*;

public class PrintFibonacciSeriesOfPrimeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value of n:");
        int n = sc.nextInt();
        System.out.println("The Fibonacci Series that are Prime up to " + n + " are:");

        // Loop through to calculate Fibonacci numbers and check if they are prime
        for (int i = 1; i <= n; i++) {
            int fibonacci = getFibonacci(i);
            if (isPrime(fibonacci)) {
                System.out.print(fibonacci + " ");
            }
        }
    }

    // Function to calculate the nth Fibonacci number
    public static int getFibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        int a = 0;
        int b = 1;
        for (int i = 3; i <= n; i++) {
            int nextTerm = a + b;
            a = b;
            b = nextTerm;
        }
        return b;
    }

    // Function to check if a number is prime
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}


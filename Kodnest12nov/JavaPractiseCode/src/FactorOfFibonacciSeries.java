import java.util.*;

public class FactorOfFibonacciSeries {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();

        // Start from 2nd Fibonacci number
        for (int i = 2; i <= n+1; i++) {
            int fibonacci = getFibonacci(i);  
            System.out.print("The factors of " + fibonacci + " are: ");
            findAndPrintFactors(fibonacci);  
            System.out.println();
        }
    }

    // Function to get the nth Fibonacci number
    public static int getFibonacci(int num) {
        if (num == 1) {
            return 1;
        }
        if (num == 2) {
            return 2;
        }
        int a = 1, b = 2;
        for (int i = 3; i <= num; i++) {
            int nextTerm = a + b;
            a = b;
            b = nextTerm;
        }
        return b;
    }

    // Function to find and print factors of a number
    public static void findAndPrintFactors(int number) {
        if (number == 0) {
            System.out.print("None");  
            return;
        }
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}





import java.util.*;
public class GetSquareOfFibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value of n: ");
		int n = sc.nextInt();
		System.out.println("The Square of the Fibonacci Series Upto "+n+" is: ");
		for(int i = 1 ; i<= n ; i++) {
			int fibonacci = getFibonacci(i);
			int SquareOfFibonacci = getSquareFibonacci(fibonacci);
			System.out.print(SquareOfFibonacci+" ");
		}

	}
	public static int getFibonacci(int n) {
		if(n == 1) {
			return 0;
		}
		if(n == 2) {
			return 1;
		}
		int a = 0;
		int b = 1;
		for(int i = 3 ; i<= n ; i++) {
			int nextTerm = a + b;
			a = b;
			b = nextTerm;
		}
		return b;
	}
	
	public static int  getSquareFibonacci(int fibonacci) {
		return fibonacci * fibonacci;
	}

}

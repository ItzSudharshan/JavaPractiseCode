import java.util.*;
public class FibonacciSeriesUptoN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num");
		int n = sc.nextInt();

		if(n == 0) {
			System.out.print("Fibonacci Series upto 0 is: 0");
		}else {
			System.out.print("The Fobonacci Series upto "+n+" is:");
			int a = 0 ;
			int b = 1;
			System.out.print(a+" ");
			while(b <= n) {
				System.out.print(b+" ");
				int nextTerm = a + b;
				a = b ;
				b = nextTerm;
			}
		}
		

	}

}

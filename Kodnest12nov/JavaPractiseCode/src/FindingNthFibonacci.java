import java.util.*;
public class FindingNthFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Input:");
		int num = sc.nextInt();
		int result = getNThFibonacci(num);
		System.out.println("The "+num+"Th Fibonacci number is "+result);

	}
	public static int getNThFibonacci(int num) {
		if(num == 1) {
			return 1;
		}
		if(num == 2) {
			return 1;
		}
		int prev1 = 1;
		int prev2 = 1;
		int current = 0;
		for(int i = 3; i<= num ; i++) {
			current = prev1 + prev2;
			prev1 = prev2;
			prev2 = current;
		}
		return current;
	}

}

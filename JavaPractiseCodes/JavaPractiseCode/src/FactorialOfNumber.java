import java.util.*;
public class FactorialOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		int result = getFactorial(num);
		System.out.println("The Factorial of the Number("+num+") is "+result);
	}
	public static int getFactorial(int num) {
		if(num == 0) {
			return 1;
		}else {
			return num*getFactorial(num - 1);
		}
	}

}

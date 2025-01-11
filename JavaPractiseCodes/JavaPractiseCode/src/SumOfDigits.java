import java.util.*;
public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		int sum = 0;
		int temp = num;
		while(temp != 0) {
			sum = sum + temp % 10;
			temp = temp/10;
		}
		System.out.println("The Sum of the Digit "+num+" is "+sum);

	}

}

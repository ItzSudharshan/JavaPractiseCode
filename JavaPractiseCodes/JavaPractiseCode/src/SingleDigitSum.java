//You need to develop a simple Java application to calculate the sum of the digits of a number until it becomes a single-digit number.

//Task: Calculate the Sum of Digits Until It Becomes a Single-Digit Number
//9875 = 9 + 8 + 7 + 5 = 29 = 2 + 9 = 11 = 1 + 1 = 2 which is  a single digit sum
import java.util.*;
public class SingleDigitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		int result = singleDigitSum(num);
		System.out.println("The Single Digit Sum of the Given Number is: "+result);
	}
	public static int singleDigitSum(int num) {
		while(num >= 10) {
			int sum = 0;
			while(num != 0) {
				sum = sum + num % 10;
				num = num/10;
			}
			num = sum;
		}
		return num;
	}

}

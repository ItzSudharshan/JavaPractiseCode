//Program to check if its a harshad number or not 
import java.util.*;
public class Program30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num = sc.nextInt();
		boolean result = checkHarshadNumber(num);
		if(result) {
			System.out.println(num+" is a Harshad Number");
		}else {
			System.out.println(num+" is not a Harshad Number");
		}
	}
	public static boolean checkHarshadNumber(int num) {
		int temp = num;
		int sum = 0;
		while(temp != 0) {
			int digit = temp % 10 ;
			sum = sum + digit;
			temp = temp/10;
		}
		return (num % sum == 0);
	}

}

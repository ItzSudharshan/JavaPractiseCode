//Program to check if given number is a Strong Number or not 
import java.util.*;
public class Program28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num = sc.nextInt();
		if(isStrongNumber(num)) {
			System.out.println(num+ " is a Strong Number");
		}else {
			System.out.println(num+" is not a Strong Number");
		}

	}
	
	public static int fact(int num) {
		if(num == 0) {
			return 1;
		}else {
			return num*fact(num - 1);
		}
	}
	
	public static boolean isStrongNumber(int num) {
		int temp, digit;
		int sum = 0;
		temp = num;
		while(temp != 0) {
			digit = temp % 10;
			sum = sum + fact(digit);
			temp = temp/10;
		}
		return num == sum;
	}

}

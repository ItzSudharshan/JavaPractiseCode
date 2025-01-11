//Java Program to check Friendly Pair or Not 6 and 28 divisioors of 6 and 28 is (1+2+3)/6 = 1 and in case of 28 it is 1+2+4+7+14/28 = 1
//therfore its a friendly pair 
import java.util.*;
public class Program32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  Number1");
		int num1 = sc.nextInt();
		System.out.println("Enter the Number2");
		int num2 = sc.nextInt();
		int  sum1 = getDivisiorsSum(num1);
		int sum2 = getDivisiorsSum(num2);
		if(num1/sum1 == num2/sum2) {
			System.out.println(num1+" and "+num2+" are Friendly Pair" );
		}else {
			System.out.println(num1+" and "+num2+" not are Friendly Pair" );
		}
	}
	public static int getDivisiorsSum(int num) {
		int sum = 0;
		int temp = num;
		for(int i = 1 ; i<= num ; i++) {
			if(num % i == 0) {
				sum = sum + i;
			}
		}
		return sum;
		
	}

}

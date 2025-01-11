//java Program for abundant number 
//An abundant number is a positive integer where the sum of its proper divisors is greater than the number itself
import java.util.*;
public class Program31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num = sc.nextInt();
		int sum = 0;
		for(int i = 1 ; i< num ; i++) {
			if(num % i == 0) {
				sum = sum + i;
			}
		}
		if(sum > num) {
			System.out.println(num+" is an Abundant Number and the Abundance is " +(sum - num));
			
		}else {
			System.out.println(num+" is not an Abundant Number");
		}

	}

}

//Java program to get the LCM and HCF of a Number
import java.util.*;
public class Program33 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number1");
		int num1 = sc.nextInt();
		System.out.println("Enter the Number1");
		int num2 = sc.nextInt();
		int lcm = 0;
		int gcdOrHcf = 0;
		for(int i = 1 ; i<= num1 || i<= num2 ; i++) {
			if(num1 % i == 0 && num2 % i == 0) {
				gcdOrHcf = i;
			}
		}
		lcm = (num1*num2)/gcdOrHcf;
		System.out.println("The LCM of " + num1 + " and " + num2 + " is "+lcm+" and the hcf is " + gcdOrHcf);
	}

}

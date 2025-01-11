//Java program for calculating Area of the Circle 
import java.util.*;
public class ProgramNo40{
	public static void main(String args[]) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the Radius:");
		int radius = sc.nextInt();
		double pi = 3.14;
		double result = pi*radius*radius;
		System.out.println("The Area of the Circle is "+ result);
	}
}
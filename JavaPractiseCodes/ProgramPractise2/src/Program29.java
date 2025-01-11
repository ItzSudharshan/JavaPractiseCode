//Java Program to check if Number is Automorphic number or not 
import java.util.*;
public class Program29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int x = sc.nextInt();
		int y = x*x;
		if(x%10 == y%10) {
			System.out.println("The square of the "+x+" is "+y+" and its Automorphic");
		}else {
			System.out.println("The square of the "+x+" is "+y+" and its not Automorphic");
		}

	}

}

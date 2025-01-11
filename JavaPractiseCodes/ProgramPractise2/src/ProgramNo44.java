//Finding Roots of A Quadratic Equation Real , Equal and Complex
import java.util.*;
public class ProgramNo44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value of a ");
		int a = sc.nextInt();
		System.out.println("Enter the Value of b");
		int b = sc.nextInt();
		System.out.println("Enter the value of c");
		int c = sc.nextInt();
		findRoots(a,b,c);

	}
	static void findRoots(int a,int b,int c) {
		if(a == 0) {
			System.out.println("Invalid Value ");
			return;
		}
		
		double d = (b*b) - (4*a*c);
		double sqrt_val = Math.sqrt(Math.abs(d));
		
		
		if(d > 0) {
			System.out.println("The Roots are Real");
			System.out.println((-b+sqrt_val)/(2*a) + "\n" + (-b - sqrt_val)/(2*a));
		}else if(d == 0) {
			System.out.println("The Roots are Equal");
			System.out.println(-(double)b/(2*a) + "\n" + -(double)b/(2*a));
		}else {
			System.out.println("The Roots are Complex");
			System.out.println(-(double)b/(2*a) + "+i" + sqrt_val/(2*a) + "\n" +
							   -(double)b/(2*a) + "-i" + sqrt_val/(2*a));
		}
	}

}

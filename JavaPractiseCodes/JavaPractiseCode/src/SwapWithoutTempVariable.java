import java.util.*;
public class SwapWithoutTempVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a  = sc.nextInt();
		System.out.println("Enter the value of b");
		int b = sc.nextInt();
		System.out.println("Before Swapping a-> "+a);
		System.out.println("Before Swapping b-> "+b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After Swapping a-> "+a);
		System.out.println("After Swapping b-> "+b);

	}

}

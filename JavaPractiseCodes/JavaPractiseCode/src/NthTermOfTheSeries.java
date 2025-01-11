import java.util.*;
public class NthTermOfTheSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Input");
		int num = sc.nextInt();
		int nthTerm = num*(num + 1)/2;
		System.out.println("The "+num+"th term of the series is "+nthTerm);

	}

}

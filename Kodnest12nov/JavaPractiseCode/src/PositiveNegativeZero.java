import java.util.*;
public class PositiveNegativeZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Input");
		int num = sc.nextInt();
		if(num == 0) {
			System.out.println("The Entered Number is 0");
		}else if(num > 0) {
			System.out.println("The Number is  a Positive Number");
		}else {
			System.out.println("The Number is a Negative Number");
		}

	}

}

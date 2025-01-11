import java.util.*;
public class SumOfSquareFirst20NaturalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i = 1 ; i<= 20 ; i++) {
			sum  = sum + i * i;
		}
		System.out.println("The Sum of Square of First 20 natural Number is "+sum);

	}

}

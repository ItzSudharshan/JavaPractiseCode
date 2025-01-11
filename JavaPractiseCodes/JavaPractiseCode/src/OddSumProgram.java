import java.util.*;
public class OddSumProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 50;
		int sum = 0;
		for(int i = 1 ; i<= n ; i++) {
			if( i % 2 != 0) {
				sum = sum + i;
			}
		}
		System.out.println("The Sum of Odd numbers till 50 is "+sum);

	}

}

import java.util.*;
public class SmallestDigitInGIvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num = sc.nextInt();
		int result = getSmallestNumber(num);
		System.out.println("The Smallest Number in the input("+num+") is "+result);

	}
	public static int getSmallestNumber(int num) {
		int sum = 0;

		int smallest = Integer.MAX_VALUE;
		while(num != 0) {
			int rem = num % 10;
			if(rem < smallest ) {
				smallest = rem;
			}
			num = num/10;
		}
		return smallest;
	}

}

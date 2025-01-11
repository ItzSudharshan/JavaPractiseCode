import java.util.*;
public class DigitCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num = sc.nextInt();
		int count = 0;
		int temp = num;
		while(temp != 0) {
			temp = temp/10;
			count++;
		}
		System.out.println("The Number of Digits in "+num+ " is "+count+" digits");

	}

}

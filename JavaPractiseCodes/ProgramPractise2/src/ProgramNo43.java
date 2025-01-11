//Count the Occurances of the digit of a Number
import java.util.*;
public class ProgramNo43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int input = sc.nextInt();
		System.out.println("Enter the Number You want to count");
		int num = sc.nextInt();
		int CountNumber = getCountOfNumber(input,num);
		System.out.println("The Number  " + num + " Occurs  "+CountNumber+ " Time ");

	}
	public static int getCountOfNumber(int input, int num) {
		int count = 0;
		while (input > 0) {

			int rem = input % 10;
			if(rem == num) {
				count++;
			}
			input = input/10;
		}
		return count;
		
	}

}

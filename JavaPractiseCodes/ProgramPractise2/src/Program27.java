//program to find the power of a Number 
import java.util.*;
public class Program27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num = sc.nextInt();
		System.out.println("Enter the Power");
		int power = sc.nextInt();
		int result = getResult(num,power);
		System.out.println("The Result is: "+result);

	}
	
	public static int getResult(int num,int power) {
		int result = 1;
		for (int i = 0 ; i< power ; i++) {
			result = result * num;
		}
		return result;
	}

}

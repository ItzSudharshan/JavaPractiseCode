//Java Program to reverse the String 
import java.util.*;
public class ProgramNo64 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str = sc.nextLine();
		String rev = "";
		for(int  i = str.length() - 1 ; i>= 0 ; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println("The Reverse of the String "+ str +" is "+rev);

	}

}

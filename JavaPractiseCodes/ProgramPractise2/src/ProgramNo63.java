//Java program to Check the String Palindrome
import java.util.*;
public class ProgramNo63 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str = sc.nextLine();
		String rev = "";
		for(int i = str.length()-1 ; i>= 0 ; i--) {
			rev = rev + str.charAt(i);
		}
		if(str.equals(rev)) {
			System.out.println("The Given String ("+str+") is a Palindrome ("+rev+")");
		}else {
			System.out.println("The Given String isnt a Palindrome");
		}

	}

}

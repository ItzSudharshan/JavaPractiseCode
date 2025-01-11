//Java program to Reemove all vowels from the String 
import java.util.*;
public class ProgramNo62 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str = sc.nextLine();
		String result = str.replaceAll("[aeiouAEIOU]","");
		System.out.println("The Output after removing all vowels is: "+result);
	}

}

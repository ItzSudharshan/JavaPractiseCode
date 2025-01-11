//Program to Calculate the ASCII value of the Character
import java.util.*;
public class ProgramNo58 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Character");
		String ch = sc.nextLine();
		char charToConvert = ch.charAt(0);
		System.out.println("The ASCII Value of " + ch + " is "+ (int)charToConvert);

	}

}

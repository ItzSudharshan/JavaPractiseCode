//java program to return  Numbers present in the String 
import java.util.*;
public class ProgramNo68 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Input:");
		String input = sc.nextLine();
		String Numbers = "";
		for(int i = 0 ; i<input.length(); i++) {
			char ch = input.charAt(i);
			
			if(Character.isDigit(ch)) {
				Numbers += ch;
			}
		}
		System.out.println("The Extracted Numbers Are: "+ Numbers);

	}

}

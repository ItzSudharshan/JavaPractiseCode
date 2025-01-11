//Remove characters from the String Except Alphabets
import java.util.*;
public class ProgramNo65 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str = sc.nextLine();
		String newStr = str.replaceAll("[^a-zA-Z]","");
		System.out.println("The Resultant string after removing characters except Alphabets are: "+newStr);
	}

}

//Remove all strings from the input 
import java.util.*;
public class ProgramNo66 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Input:");
		String input = sc.nextLine();
		String newStr = input.replaceAll("[()\\[\\]\\{}]","");
		System.out.println("The New String after removing all brackets are : "+newStr);

	}

}

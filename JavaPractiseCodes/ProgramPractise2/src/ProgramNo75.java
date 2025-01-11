//Remove all occurance of the Sntered Specified Word 
import java.util.*;
public class ProgramNo75 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Sentence:");
		String sentence = sc.nextLine();
		System.out.println("Enter the Letter that You want to remove:");
		String removalWord = sc.nextLine();
		String result = sentence.replace(removalWord, "");
		System.out.println("The result after removing all occurances of the letter "+ removalWord + " is "+result);
	}

}

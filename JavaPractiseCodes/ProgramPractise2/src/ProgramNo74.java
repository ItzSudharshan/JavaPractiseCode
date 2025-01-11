//Replace a Substring with a String 
import java.util.*;
public class ProgramNo74 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Sentence:");
		String sentence = sc.nextLine();
		System.out.println("Enter the Word that You want to Replace :");
		String wordToBeReplaced = sc.nextLine();
		System.out.println("Enter the Replacement Word");
		String replaceMentWord = sc.nextLine();
		String finalResult = sentence.replace(wordToBeReplaced, replaceMentWord);
		System.out.println("The Updated Result is "+finalResult);

	}

}

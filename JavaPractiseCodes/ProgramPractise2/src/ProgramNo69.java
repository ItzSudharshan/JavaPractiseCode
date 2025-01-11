//Capitalize first and last letter of each word in a sentence 
import java.util.*;
public class ProgramNo69 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Sentence :->");
		String setence = sc.nextLine();
		String[] str = setence.split("\\s");
		String finalResult = "";
		for(String word: str) {
			int length = word.length();
			if(length > 1) {
				String first = word.substring(0,1);
				String middle = word.substring(1, length - 1);
				char last = word.charAt(length - 1);
				
				finalResult = finalResult + first.toUpperCase() + middle + Character.toUpperCase(last) + " ";
			}else {
				finalResult = finalResult + word.toUpperCase() + " ";
			}
		}
		System.out.println("The Result(Capitalize First Letter and Last Letter ) in the sentence is "+finalResult);

	}

}

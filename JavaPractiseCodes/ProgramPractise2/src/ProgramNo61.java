//Count the Number of Vowels in the Sentence 
import java.util.*;
public class ProgramNo61 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Sentence");
		String sentence = sc.nextLine();
		int vowelCount = 0;
		for(int i = 0 ; i<sentence.length(); i++) {
			char ch = sentence.charAt(i);
			char lowerCase = Character.toLowerCase(ch);
			if(lowerCase == 'a' || lowerCase == 'e' || lowerCase == 'i' ||lowerCase == 'o' || lowerCase == 'u') {
				vowelCount++;
			}
		}
		System.out.println("The Number of Vowels in the Sentence are :-> " + vowelCount);

	}

}

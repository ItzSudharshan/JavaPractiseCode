//To Get the First Non repeating Characters 
import java.util.*;
public class ProgramNo72 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Sentence:->");
		String sentence = sc.nextLine();
		char count = getNonRepeating(sentence);
		if(count != 0) {
			System.out.println("The First Non Repeating Character is :" + count);
		}else {
			System.out.println("All the Characters are Repeating.");
		}
	}
	public static char getNonRepeating(String sentence) {
		int[] freq = new int[256];
		for(int i = 0 ; i<sentence.length(); i++) {
			freq[sentence.charAt(i)]++;
		}
		
		for(int i = 0 ; i<sentence.length(); i++) {
			if(freq[sentence.charAt(i)] == 1){
				return sentence.charAt(i);
			}
		}
		return 0;
	}

}

//Java program to Reverse the Entire Sentence 
import java.util.*;
public class ProgramNo67 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Sentence:");
		String sentence = sc.nextLine();
		String words[] = sentence.split(" ");
		StringBuilder reverseSentence = new StringBuilder();
		for(int i = words.length - 1 ; i>=0 ; i--) {
			reverseSentence.append(words[i]);
			
			if(i != 0) {
				reverseSentence.append(" ");
			}
		}
		System.out.println("The Reversed Sentence is Given as Below : " + reverseSentence);

	}

}

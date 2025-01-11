//Program to Display Only repeated Characters 
import java.util.*;
public class ProgramNo71 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Sentence :->");
		String sentence = sc.nextLine();
		getRepeatedCharacters(sentence);

	}
	
	public static void getRepeatedCharacters(String sentence) {
		HashMap<Character, Integer> hm = new HashMap<>();
		int length = sentence.length();
		for(int i = 0 ; i < length; i++) {
			char ch = sentence.charAt(i);
			if(ch != ' ') {
			if(hm.containsKey(ch)) {
				hm.put(ch, hm.get(ch) + 1);
			}else {
				hm.put(ch,1);
			}
		}
	}
		System.out.println("The Repeated Characters in the Given Sentence are:->");
		for(Map.Entry<Character, Integer> entry : hm.entrySet()) {
			char character = entry.getKey();
			int frequency = entry.getValue();
			if(frequency > 1 ) {
				System.out.println("Character "+character+ " Appears ->"+frequency+" Times");
			}
		}
	}

}

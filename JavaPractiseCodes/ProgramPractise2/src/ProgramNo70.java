//Program to Check the Frequency of Characters 
import java.util.*;
public class ProgramNo70 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Sentence :->");
		String str = sc.nextLine();
		getFreqOfcharacter(str);

	}
	
	public static void  getFreqOfcharacter(String str) {
		HashMap<Character, Integer> hm = new HashMap<>();
		int length = str.length();
		for(int i = 0 ; i< length; i++) {
			char ch = str.charAt(i);
			if(ch != ' ') {
			if(hm.containsKey(ch)) {
				hm.put(ch, hm.get(ch)+ 1);
			}else {
				hm.put(ch, 1);
			}
		}
	}
		System.out.println("CHARACTER ||   FREQUENCY");
		for(Map.Entry<Character, Integer> entry: hm.entrySet()) {
			char characters = entry.getKey();
			int frequency = entry.getValue();
			System.out.println(characters+"---------------->"+frequency);
		}
	}

}

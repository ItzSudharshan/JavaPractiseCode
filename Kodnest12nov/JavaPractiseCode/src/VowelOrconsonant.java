import java.util.*;
public class VowelOrconsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Input");
		char ch = sc.next().charAt(0);
		if(Character.isLetter(ch)) {
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'  ||
			   ch == 'A'  || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
				System.out.println(ch+" is a vowel");
			}else {
				System.out.println(ch+" is  a consonant");
			}
		}else {
			System.out.println(ch+" is not a valid alphabet character");
		}

	}

}

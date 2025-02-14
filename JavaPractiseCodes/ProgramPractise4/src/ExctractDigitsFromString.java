import java.util.*;
public class ExctractDigitsFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Input");
		String str = sc.nextLine();
		char[] arr = str.toCharArray();
		StringBuilder result = new StringBuilder();
		for (int i = 0 ; i<str.length(); i++) {
			char currentCharacter = arr[i];
			if(Character.isDigit(currentCharacter)) {
				result.append(currentCharacter);
			}
		}
		System.out.println("The Digits Present in String "+str+"is "+result);

	}

}


/*
 * 
 * OUTPUT

Enter the Input
abc123xyz456
The Digits Present in String abc123xyz456is 123456

*/
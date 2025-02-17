import java.util.*;
public class Program95 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Sentence:");
		String str = sc.nextLine();
		String vowels = "";
		String consonants = "";
		for(int i = 0 ; i< str.length(); i++) {
			char ch = str.charAt(i);
			if(Character.isLetter(ch)) {
				if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
				   ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
					vowels += ch;
				}else {
					consonants += ch;
				}
			}
		}
		String result1 = reverse(vowels);
		String result2 = consonants;
		
		System.out.println("The vowels present in the given sentence but in reversed Order is "
				+result1+" ");
		System.out.println("The consonants present in the given sentence is "
				+result2+" ");
		if(isPalindrome(result1)) {
			System.out.println(result1+" is a Palindrome");
		}else {
			System.out.println(result1+" is not a Palindrome");
		}
		if(isPalindrome(result2)) {
			System.out.println(result2+" is a Palindrome");
		}else {
			System.out.println(result2+" is not a Palindrome");
		}
		
	}
	public static String reverse(String str) {
		String reverse = "";
		for(int i = str.length()-1; i>= 0 ; i--) {
			reverse = reverse + str.charAt(i);
		}
		return reverse;
	}
	
	public static boolean isPalindrome(String str) {
		String reverse = "";
		for(int i = str.length()-1; i>=0 ; i--) {
			reverse = reverse + str.charAt(i);
		}
		if(str.equals(reverse)) {
			return true;
		}else {
			return false;
		}
	}

}


/*
 * Enter the Sentence:
KodNest Technologies
The vowels present in the given sentence but in reversed Order is eiooeeo 
The consonants present in the given sentence is KdNstTchnlgs 
eiooeeo is not a Palindrome
KdNstTchnlgs is not a Palindrome
--------------------------------------------------------------------------
Enter the Sentence:
MADAM
The vowels present in the given sentence but in reversed Order is AA 
The consonants present in the given sentence is MDM 
AA is a Palindrome
MDM is a Palindrome


 */

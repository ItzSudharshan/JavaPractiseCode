import java.util.Scanner;
public class PalindromeSwapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str = sc.nextLine();
		if(isPalindromePossible(str)) {
			System.out.println(str+" can be arranged to form a Palidome");
		}else {
			System.out.println(str+" cannot be arranged to form a Palidome");
		}

	}
	
	public static boolean isPalindromePossible(String str) {
		int[] charCount = new int[256];
		for(char c : str.toCharArray()) {
			charCount[c]++;
		}
		int oddCount = 0;
		for(int count: charCount) {
			if(count % 2 != 0) {
				oddCount++;
			}
		}
		return oddCount <= 1;
	}

}

/*
OUTPUT 
Enter the String:
ivicc
ivicc can be arranged to form a Palidome
--------------------------------------------------

Enter the String:
abcd
abcd cannot be arranged to form a Palidome


*/
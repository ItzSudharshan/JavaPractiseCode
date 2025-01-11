//Check 2 Strings are anagram or not 
import java.util.*;
public class ProgramNo73 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String1:");
		String str1 = sc.nextLine();
		System.out.println("Enter the String2:");
		String str2 = sc.nextLine();
		if(isAnagram(str1, str2)) {
			System.out.println("The Given Strings "+str1+" and "+str2+" are Anagram");
		}else {
			System.out.println("The Given Strings "+str1+" and "+str2+" are not Anagram");
		}

	}
	
	public static boolean isAnagram(String str1,String  str2) {
		if(str1.length() != str2.length()) {
			return false;
		}
		char[] first = str1.toCharArray();
		char[] second = str2.toCharArray();
		
		Arrays.sort(first);
		Arrays.sort(second);
		
		
		return Arrays.equals(first, second);
	}

}

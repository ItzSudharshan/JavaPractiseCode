//Program to toggle the String (Uppercase to LowerCase and LowerCase to UpperCase )
import java.util.*;
public class ProgramNo60 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str  = sc.nextLine();
		String str1 = " ";
		for(int i = 0 ; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(Character.isUpperCase(ch)) {
				str1 = str1 + Character.toLowerCase(str.charAt(i));
			}else if(Character.isLowerCase(ch)) {
				str1 = str1 + Character.toUpperCase(ch);
			}else {
				str1 = str1 + ch;
			}
		}
		System.out.println("String After Toggling(Uppercase -> Lower Case / Lower Case -> Upper Case): " + str1);

	}

}

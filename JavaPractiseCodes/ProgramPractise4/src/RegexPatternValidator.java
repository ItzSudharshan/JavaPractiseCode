import java.util.*;
import java.util.regex.*;
import java.util.regex.PatternSyntaxException;;
public class RegexPatternValidator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Regex Pattern:");
		String regex = sc.nextLine();
		try {
			Pattern.compile(regex);
			System.out.println(regex+" is a valid Pattern");
		}catch (PatternSyntaxException e) {
			System.out.println(regex+" is a invalid Pattern");
			// TODO: handle exception
		}finally {
			sc.close();
		}

	}

}
/*
 * 
 * OUTPUT :
 * Enter the Regex Pattern:
[a-zA-Z0-9]+
[a-zA-Z0-9]+ is a valid Pattern
-------------------------------------
Enter the Regex Pattern:
(?<=\d)
(?<=\d) is a valid Pattern
-----------------------------------
Enter the Regex Pattern:
[a-zA-Z0-9+
[a-zA-Z0-9+ is a invalid Pattern
-----------------------------------
 * 
 */

//Find the Length of the String without using lenght();
import java.util.*;
public class ProgramNo59 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str = sc.nextLine();
		int count = 0 ;
		for(int i = 0 ; i<str.toCharArray().length; i++) {
			count++;
		}
		System.out.println("The Lenght of the  Given String is "+count);
	}

}

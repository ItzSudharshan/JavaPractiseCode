//Program to replace all 0s with 1s
import java.util.*;
public class Program38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Input:");
		String str1 = sc.nextLine();
		String str2 = "";
		for(int i = 0 ; i< str1.length(); i++) {
			if(str1.charAt(i) == '0') {
				str2 = str2 + '1';
			}else {
				str2 = str2 + str1.charAt(i);
			}
		}
		System.out.println("Before Replacing all 0s With 1s :"+str1);
		System.out.println("After Replacing all 0s With 1s :"+str2);

	}

}

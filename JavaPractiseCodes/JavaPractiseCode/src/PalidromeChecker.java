import java.util.*;
public class PalidromeChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num = sc.nextInt();
		boolean result = checkPalindrome(num);
		if(result) {
			System.out.println("The "+num+" is a Palindrome");
		}else {
			System.out.println("The "+num+" is not a Palidrome");
		}

	}
	public static boolean checkPalindrome(int num) {
		int temp = num ; 
		int rev = 0 ;
		while(temp != 0) {
			int rem = temp % 10;
			rev = rev * 10 + rem;
			temp = temp/10;
		}
		return rev == num;
	}

}

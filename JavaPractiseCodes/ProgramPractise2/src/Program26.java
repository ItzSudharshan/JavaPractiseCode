//Write a Java Program to find the squareroot of the number without using Sqrt function and use Binary search 
import java.util.*;
public class Program26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num = sc.nextInt();
		int result = getSquareRoot(num);
		System.out.println("The Square root of " + num + " is "+result);
	}
	
	
	public static int getSquareRoot(int num) {
		int left = 1;
		int right = num ;
		int ans = 0;
		
		
		while(left <= right) {
			int mid = left + (right - left)/2;
			
			
			if(mid * mid == num) {
				return mid;
			}
			
			if(mid * mid < num) {
				left = mid + 1;
				ans = mid;
			}else {
				right = mid - 1;
			}
		}
		return ans;
	}

}

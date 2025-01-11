//Getting Sum of All Elements in the Array
import java.util.*;
public class ProgramNo48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the Array:");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the Elements of the Array:");
		for(int i = 0 ; i< size ; i++) {
			arr[i] = sc.nextInt();
		}
		int result = sumOfArray(arr);
		System.out.println("The Sum of All Elements of the Array:->" + result);
		
	}
	
	public static int sumOfArray(int arr[]) {
		int sum = 0 ;
		int n = arr.length;
		
		for(int i = 0 ; i<n ; i++) {
			sum = sum + arr[i];
		}
		return sum;
	}

}

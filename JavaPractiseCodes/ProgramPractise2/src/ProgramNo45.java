//Java program for finding the largest Element in the array 
import java.util.*;
public class ProgramNo45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the array :");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the Elements of the Array :");
		for(int i = 0 ; i< size ; i++) {
			arr[i] = sc.nextInt();
		}
		int result = getLargestElementOfArray(arr);
		System.out.println("The largest Element in the given array is "+result);

	}
	public static int getLargestElementOfArray(int arr[]) {
		int max = arr[0];
		int n = arr.length;
		for(int i = 0 ; i< n ; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

}

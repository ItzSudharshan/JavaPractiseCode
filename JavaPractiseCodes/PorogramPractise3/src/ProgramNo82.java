//Java Program to perform Linear Search 
import java.util.*;
public class ProgramNo82 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the Array:");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the Elements of the Array:");
		for(int i = 0 ; i<size ; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the Target Element that you want to Search:");
		int target = sc.nextInt();
		int result = LinearSearch(arr, size , target);
		if(result == -1) {
			System.out.println("The target Element doesnt exist in the Array");
		}else {
			System.out.println("The Target Element is present at index "+result);
		}

	}
	public static int LinearSearch(int arr[],int  size ,int  target) {
		int n = arr.length;
		for(int i = 0 ; i< n ; i++) {
			int element = arr[i];
			if(element == target) {
				return i;
			}
		}
		return -1;
	}
	

}

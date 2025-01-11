//Java Program for Binary Search
import java.util.*;
public class ProgramNo81 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the Sorted Array");
		for(int i = 0 ; i < size ; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the Target Element to be Searched");
		int target = sc.nextInt();
		int result = binarySearch(arr,size,target);
		if(result == -1) {
			System.out.println("The target element doesnt exist in the Array!");
		}else {
			System.out.println("The target Element is present at the index:" + result);
		}

	}
	
	public static int binarySearch(int arr[],int size,int target) {
		int start = 0;
		int end = arr.length - 1;
		while(start <= end) {
			int mid = start + ((end - start)/2);
			
			if(target == arr[mid]) {
				return mid;
			}else if(target <= arr[mid]) {
				end = mid - 1;
			}else {
				start = mid + 1;
			}
		}
		return -1;
	}

}

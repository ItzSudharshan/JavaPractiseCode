//Program to find the Second Smallest Element in the Array 
import java.util.*;
public class ProgramNo47 {

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
		int result = getSecondSmallestElement(arr);
		System.out.println("The Second Smallest Element in the Given array is "+result);

	}
	public static int getSecondSmallestElement(int arr[]) {
		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;
		int n = arr.length;
		for(int i = 0 ; i< n ; i++) {
			if(arr[i] < smallest) {
				smallest = arr[i];
			}else if(arr[i] != smallest && arr[i] < secondSmallest) {
				secondSmallest = arr[i];
			}
		}
		return secondSmallest;
	}

}

//Java Program to perform Merge Sort 
import java.util.*;
public class ProgramNo86 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the Array:");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the Elements of the Array:");
		for(int i = 0 ; i < size ; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("The Elements after Sorting Using Merge Sort are:");
		MergeSort(arr, 0 , arr.length - 1);
		printArray(arr);
	}
	
	public static void MergeSort(int arr[], int low , int high) {
		if(low >= high) {
			return;
		}
		int mid = (low + high)/2;
		MergeSort(arr, low , mid);
		MergeSort(arr, mid + 1, high);
		Merge(arr, low, mid , high);
	}
	
	public static void Merge(int arr[],int  low, int mid, int high) {
		int left = low;
		int right = mid + 1;
		ArrayList<Integer> temp = new ArrayList<>();
		while(left <= mid && right <= high) {
			if(arr[left] <= arr[right]) {
				temp.add(arr[left]);
				left++;
			}else {
				temp.add(arr[right]);
				right++;
			}
		}
		while(left <= mid) {
			temp.add(arr[left]);
			left++;
		}
		while(right <= high) {
			temp.add(arr[right]);
			right++;
		}
		
		for(int i = low ; i<= high; i++) {
			arr[i] = temp.get(i - low);
		}
	}
	public static void printArray(int arr[]) {
		int n = arr.length;
		for(int i = 0 ; i< n ; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}

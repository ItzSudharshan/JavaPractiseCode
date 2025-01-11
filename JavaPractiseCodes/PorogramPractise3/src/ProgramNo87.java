//Porgram to Perform Quick Sort 
import java.util.*;
public class ProgramNo87 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the Array:");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the Eelements of the Array:");
		for(int i = 0; i < size ; i++) {
			arr[i] = sc.nextInt(); 
		}
		System.out.println("The Elements of the Array After Sorting using Quick Sort Are:");
		QuickSort(arr, 0 , arr.length - 1);
		printArray(arr);

	}
	
	public static void QuickSort(int arr[], int lb , int ub) {
		if(lb < ub) {
			int pivotIndex = partition(arr, lb, ub);
			QuickSort(arr, lb, pivotIndex -1);
			QuickSort(arr, pivotIndex + 1, ub);
		}
	}
	
	public static int partition(int arr[],int  lb,int  ub) {
		int pivot = arr[lb];
		int start = lb;
		int end = ub;
		
		while(start < end) {
			while(start <= ub && arr[start] <= pivot) {
				start++;
			}
			
			while(end >= lb && arr[end] > pivot) {
				end--;
			}
			if(start < end) {
				swap(arr, start, end);
			}
		}
		swap(arr, lb , end);
		return end;
	}
	public static void swap(int arr[], int i , int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void printArray(int arr[]) {
		int n = arr.length;
		for(int i = 0 ; i< n ; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}

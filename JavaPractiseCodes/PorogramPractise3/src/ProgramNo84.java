//Java Program to Perform Selection Sort
import java.util.*;
public class ProgramNo84 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Array:");
		int size = sc.nextInt();
		int arr[]  = new int[size];
		System.out.println("Enter the Elements of the Array:");
		for(int i = 0 ; i<size ; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("The Elements after Sorting using Selection Sort are:");
		selectionSort(arr);
		printArray(arr);
	}
	public static void selectionSort(int arr[]) {
		int n = arr.length;
		for(int i = 0 ; i< n - 1 ; i++) {
			int min = i ;
			for(int j = i + 1; j < n; j++) {
				if(arr[j] < arr[min]) {
					min = j;
				}
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
	}
	
	public static void printArray(int arr[]) {
		int n = arr.length;
		for(int i = 0 ; i< n ; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}

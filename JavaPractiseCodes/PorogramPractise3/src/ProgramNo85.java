//Java program to Perform Insertion Sort 
import java.util.*;
public class ProgramNo85 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Array:");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the Elements of the array:");
		for(int i = 0 ; i< size ; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("The Elements of the Array After Sorting using Insertion Sort is :");
		InsertionSort(arr);
		PrintArray(arr);
	}
	public static void InsertionSort(int arr[]) {
		int n = arr.length;
		for(int i = 1; i< n ; i++) {
			int temp = arr[i];
			int j = i - 1;
			while(j >= 0 && arr[j] > temp) {
				arr[j + 1] = arr[j];
				j--;
			}
			  arr[j + 1] = temp;
		}
	}
	
	public static void PrintArray(int arr[]) {
		int n = arr.length;
		for(int i = 0 ; i< n ; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}


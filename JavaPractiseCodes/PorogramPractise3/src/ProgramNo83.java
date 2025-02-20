//Porgam to Perform Bubble Sort 
import java.util.*;
public class ProgramNo83 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the Array:");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the Elements of the Array:");
		for(int i = 0 ; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("The Elements of the Array Before Performing Bubble Sort is:");
		for(int i = 0 ; i< arr.length; i++) {
			System.out.println(arr[i]+" ");
		}
		bubbleSort(arr);
		System.out.println("The Elements of the Array After Performing Bubble Sort is:");
		printArray(arr);

	}
	
	public static void bubbleSort(int arr[]) {
		int n = arr.length;
		for(int i = 0 ; i<n-1 ; i++) {
			for(int j = 0 ; j<n-i-1; j++) {
				if(arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	public static void printArray(int arr[]) {
		int n = arr.length;
		for(int i = 0 ; i<n ; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}

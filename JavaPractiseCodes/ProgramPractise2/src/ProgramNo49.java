//Program to Reverse an Array 
import java.util.*;
public class ProgramNo49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the Array :");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the Elements of the Array:");
		for(int i = 0  ; i<size ; i++) {
			arr[i] = sc.nextInt();
		}

		getReverse(arr);
	
	}
	static void  getReverse(int arr[]) {
		int n = arr.length;
		System.out.println("The Reverse of the Given Array is:-> ");
		
		for(int i = n-1 ; i>=0 ; i--) {
			System.out.print(arr[i]+" ");
		}
	}

}

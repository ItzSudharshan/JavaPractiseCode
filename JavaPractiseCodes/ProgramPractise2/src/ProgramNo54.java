//Program to Count and Display Distinct element in the Array
import java.util.*;
public class ProgramNo54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size  of The Array:");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the Element of the Array:");
		for(int i = 0 ; i < size ; i++) {
			arr[i] = sc.nextInt();
		}
		distinctElelementinArray(arr);
	}
	
	public static void  distinctElelementinArray(int arr[]) {
		int size = arr.length;
		
		HashSet<Integer> hs = new HashSet<>();
		for(int i = 0 ; i< size ; i++) {
			hs.add(arr[i]);
		}
		System.out.print("The Distinct Elements in the Array are as Follows:->");
		for(Integer element : hs) {
			System.out.print(element+" ");
		}
		System.out.println();
		int count = hs.size();
		System.out.println("The distinct Elements in the Given array : -> " + count);
	}

}

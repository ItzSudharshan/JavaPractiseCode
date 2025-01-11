//Sort First half of the Array in Ascending order and Second Half of the Array in Descending Order
import java.lang.reflect.Array;
import java.util.*;
public class ProgramNo50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of The Array:");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the Elements of the Array :");
		for(int i = 0 ; i < size ; i++) {
			arr[i] = sc.nextInt();
		}
		sortfirstHalfAscendingSecondHalfDescending(arr);

	}
	static void sortfirstHalfAscendingSecondHalfDescending(int arr[]) {
		Arrays.sort(arr);
		int size = arr.length;
		
		System.out.println("The Array After Sorting (first half ascending and Second Half Descending :->)");
		for(int i = 0 ; i <size/2 ; i++) {
			System.out.print(arr[i]+" ");
		}
		
		for(int j = size - 1 ; j>= size/2; j--) {
			System.out.print(arr[j]+" ");
		}
	}

}

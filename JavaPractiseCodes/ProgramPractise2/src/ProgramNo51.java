//Sort The Arrays in Java 
import java.util.*;
public class ProgramNo51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the Array:");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the Elements of the Array");
		for(int i = 0 ; i< size ; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("Arrays Elements After Sorting :->");
		for(int i = 0 ; i< arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

}

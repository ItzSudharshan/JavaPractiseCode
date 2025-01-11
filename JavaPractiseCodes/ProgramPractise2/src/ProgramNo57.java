//Count the Even and Odd Numbers in the Array
import java.util.*;
public class ProgramNo57 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the Array:");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("The Elements of the array are:->");
		for(int i = 0 ; i<size ; i++) {
			arr[i] = sc.nextInt();
		}
		getCountOfEvenAndOdd(arr);

	}
	public static void getCountOfEvenAndOdd(int arr[]) {
		int even = 0 ;
		int odd = 0;
		int size = arr.length;
		
		for(int i = 0 ; i<size ; i++) {
			if(arr[i] % 2 == 0) {
				even++;
			}else if(arr[i] % 2 == 1) {
				odd++;
			}
		}
		System.out.println("The Number of Even Elements of the Array is: " + even);
		System.out.println("The Number of Odd Elements of the Array is : " + odd);
	}

}

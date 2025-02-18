import java.util.*;
public class ProgramNo98 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the Array:");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the Elements of the Array:");
		for(int i = 0 ; i< size;i++) {
			arr[i] = sc.nextInt();
		}
		int j = 0;
		int temp[] = new int[size];
		for(int i = 0 ;i< size; i++) {
			if(arr[i] != 0) {
				temp[j++] = arr[i];
			}
		}
		while(j < size) {
			temp[j++] = 0;
		}
		for(int i = 0 ; i< size; i++) {
			arr[i] = temp[i];
		}
		System.out.println("All 0 number is pushed to the end of the array:");
		for(int num: arr) {
			System.out.print(num+" ");
		}
	}

}

//Display only repeated Elements from the array 
import java.util.*;
public class ProgramNo55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the Array:");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the Elements of the Array:");
		for(int i = 0 ; i<size ; i++) {
			arr[i] = sc.nextInt();
		}
		displayRepeatedElements(arr);

	}
	
	public static void displayRepeatedElements(int arr[]) {
		int size = arr.length;
		
		HashMap<Integer, Integer> hm = new HashMap<>();
		for(int i = 0 ; i<size; i++) {
			if(hm.containsKey(arr[i])) {
				hm.put(arr[i], hm.get(arr[i]) + 1);
			}else {
				hm.put(arr[i], 1);
			}
		}
		
		System.out.print("The Repeating Elements of the Array are: ->");
		for(Map.Entry<Integer, Integer> entry : hm.entrySet()) {
			int frequency = entry.getValue();
			int element = entry.getKey();
			if(frequency  > 1) {
				System.out.print(element+ " ");
			}
		}
	}

}

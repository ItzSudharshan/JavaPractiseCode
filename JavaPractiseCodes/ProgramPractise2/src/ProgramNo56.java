//Diplay non repeating Elements in the array
import java.util.*;
public class ProgramNo56 {

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
		getNonrepeatingElements(arr);

	}
	public static void getNonrepeatingElements(int arr[]) {
		HashMap<Integer, Integer> hm = new HashMap<>();
		int size = arr.length;
		for(int i = 0 ; i<size ; i++) {
			if(hm.containsKey(arr[i])) {
				hm.put(arr[i], hm.get(arr[i]) + 1);
			}else {
				hm.put(arr[i], 1);
			}
		}
		System.out.println("The non repeating Elements of the Array:");
		for(Map.Entry<Integer, Integer> entry: hm.entrySet()) {
			int element = entry.getKey();
			int frequency = entry.getValue();
			if(frequency == 1) {
				System.out.println(element+" ");
			}
		}
	}

}

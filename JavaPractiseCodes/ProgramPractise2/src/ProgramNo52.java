//Count frequency of Each ELement in the Array 
import java.util.*;
public class ProgramNo52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the Array:");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the Elements of the Array");
		for(int i = 0 ; i<size ; i++) {
			arr[i] = sc.nextInt();
		}
		getFreqofArray(arr);

	}
	public static void getFreqofArray(int arr[]) {
		HashMap<Integer, Integer> hm = new HashMap<>();
		for(int i = 0 ; i< arr.length; i++) {
			if(hm.containsKey(arr[i])) {
				hm.put(arr[i], hm.get(arr[i]) + 1);
			}else {
				hm.put(arr[i], 1);
			}
		}
		System.out.println("The Frequency of Elements in the Array is Given Below:");
		System.out.println("ELEMENT || FREQUENCY");
		for(Map.Entry<Integer, Integer> entry : hm.entrySet()) {
		System.out.println(entry.getKey()+"-------->"+entry.getValue());
		}
	}

}

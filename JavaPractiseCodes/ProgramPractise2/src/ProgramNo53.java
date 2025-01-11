//Sort the Elements of the Array By Frequency
import java.util.*;
public class ProgramNo53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the Size of the Array:");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the Elements of the Array:");
		for(int i = 0 ; i< size ; i++) {
			arr[i] = sc.nextInt();
		}

		sortByFreq(arr);
	}
	
	public static void sortByFreq(int arr[]) {
		HashMap<Integer, Integer> hm = new HashMap<Integer,Integer>();
		int size = arr.length;
		for(int i = 0 ; i< size ; i++) {
			if(hm.containsKey(arr[i])) {
				hm.put(arr[i], hm.get(arr[i]) + 1);
			}else {
				hm.put(arr[i], 1);
			}
		}
		List<Map.Entry<Integer, Integer>> list = new LinkedList<>(hm.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
			public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
				return o2.getValue().compareTo(o1.getValue());
			}
		});
		System.out.println("The Elements Sorted According to Frequency From Max Frequency is Given Below:");
		for(Map.Entry<Integer, Integer> entry : list) {
			int element = entry.getKey();
			int frequency = entry.getValue();
			for(int i = 0 ; i< frequency; i++) {
				System.out.print(element+" ");
			}
			
		}
	}

}

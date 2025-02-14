import java.util.*;
public class ReverseAStringWithoutTemporaryVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str = sc.nextLine();
		char arr[] = str.toCharArray();
		int left = 0;
		int right = arr.length - 1;
		while(left < right) {
			arr[left] = (char)(arr[left] + arr[right]);
			arr[right] = (char)(arr[left] - arr[right]);
			arr[left] = (char)(arr[left] - arr[right]);
			left++;
			right--;
		}
		System.out.println("The reverse of the String Without using Temporary Variable is: "+(new String(arr)));

	}

}

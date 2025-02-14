import java.util.*;
public class LongestSubstringNoRepeating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str = sc.nextLine();
		HashSet<Character> hs = new HashSet<>();
		int left = 0 , right = 0 , max = 0 ;
		while(right < str.length()) {
			if(!hs.contains(str.charAt(right))) {
				hs.add(str.charAt(right));
				max = Math.max(max, hs.size());
				right++;
			}else {
				hs.remove(str.charAt(left));
				left++;
			}
		}
		System.out.println("Longest Substring Without Repeating Characters: "+max);

	}

}
/*
OUTPUT:
Enter the String:
abcabcbb
Longest Substring Without Repeating Characters: 3


---------------------------------------------------
Enter the String:
bbbbb
Longest Substring Without Repeating Characters: 1

-----------------------------------------------------
*/
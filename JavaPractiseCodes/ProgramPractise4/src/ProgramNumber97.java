import java.util.Scanner;
public class ProgramNumber97 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num = sc.nextInt();
		int count = 0;
		for(int A = num - 1 ; A > num/2; A--) {
			int B = A - num;
			count++;
		}
		System.out.println("Possible Addition Count = "+count);

	}

}
/*
 * 
 * Enter the Number:
7
Possible Addition Count = 3

Explaination
✅ Explanation:
The possible pairs (A, B) where A > B and A + B = 7 are:

(6,1)
(5,2)
(4,3)
Thus, the output is 3.

 */

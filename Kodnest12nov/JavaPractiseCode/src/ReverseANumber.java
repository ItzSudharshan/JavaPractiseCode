import java.util.*;
public class ReverseANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number to reverse");
		int num = sc.nextInt();
		int temp = num;
		int rev = 0;
		while(temp != 0) {
			int rem = temp % 10;
			rev = rev*10 + rem;
			temp = temp/10;
		}
		System.out.println("The reverse of the Given Number "+num+" is "+rev);

	}

}

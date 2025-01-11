import java.util.*;
public class nEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		int count = 1;
		System.out.println("The "+n+" even numbers are");
		for(int i = 1 ; count<= n ; i++) {
			if(i % 2 == 0) {
				System.out.println(i+" ");
				count++;
			}
		}

	}

}

import java.util.*;
public class NthPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Input");
		int num = sc.nextInt();
		int count = 1;
		System.out.println("The First "+num+" Prime Number are:");
		for(int i = 2; count <= num ; i++) {
			if(isPrime(i)) {
				System.out.println(i+" ");
				count++;
			}
		}

	}
	public static boolean isPrime(int num) {
		if(num < 2 ) {
			return false;
		}
		for(int i = 2 ; i*i <= num ; i++) {
			if(num %i == 0) {
				return false;
			}
		}
		return true;
	}

}

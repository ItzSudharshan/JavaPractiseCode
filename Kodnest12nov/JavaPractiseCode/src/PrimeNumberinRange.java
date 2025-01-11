import java.util.*;
public class PrimeNumberinRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Starting Range:");
		int start  = sc.nextInt();
		System.out.println("Enter the Ending Range:");
		int end = sc.nextInt();
		for(int i = start; i<= end; i++) {
			if(isPrime(i)) {
				System.out.println(i+" ");
			}
		}

	}
	public static boolean isPrime(int num) {
		if(num < 2) {
			return false;
		}
		for(int i = 2 ; i*i <= num ; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}

}

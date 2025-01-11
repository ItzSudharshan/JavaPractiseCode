import java.util.*;
public class CheckPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		boolean result = checkPrimeNumber(num);
		if(result) {
			System.out.println(num+" is a Prime Number");
		}else {
			System.out.println(num+" is not a Prime Number");
		}

	}
	public static boolean checkPrimeNumber(int num) {
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

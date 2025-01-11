import java.util.*;
public class PerfectSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num = sc.nextInt();
		boolean result = checkPerfectSquare(num);
		if(result) {
			System.out.println(num+" is a Perfect Square");
		}else {
			System.out.println(num+" is not a Perfect Square");
		}

	}
	public static boolean checkPerfectSquare(int num) {
		if(num <= 0) {
			return false;
		}
		double sqrt = (int)Math.sqrt(num);
		return (sqrt*sqrt == num);
	}

}

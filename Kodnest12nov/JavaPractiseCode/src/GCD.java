import java.util.*;
public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 2 Numbers:");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int result =  getGCD(num1,num2);
		System.out.println("The GCD of "+num1+" and "+num2+" is " +result);

	}
public static int getGCD(int a , int b) {
	if(b == 0) {
		return a;
	}else {
		return getGCD(b, a%b);
	}
}

}

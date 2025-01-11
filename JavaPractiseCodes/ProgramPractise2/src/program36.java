//java Program to Convert from Octal to Decimal 
import java.util.*;
public class program36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Octal:");
		int octal  = sc.nextInt();
		int decimal = convertToDecimal(octal);
		System.out.println("The Octal Number ("+octal+") converted to Decimal is :"+decimal);

	}

	public static int convertToDecimal(int octal) {
		int n = 0;
		int decimal = 0;
		
		while (octal > 0) {
			int temp = octal % 10;
			decimal = decimal + (int)(temp*Math.pow(8, n));
			octal /= 10;
			n++;
		}
		return decimal;
	}
}

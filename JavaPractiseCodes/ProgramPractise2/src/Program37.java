//Program to Convert from hexaDecimal to Decimal
import java.util.*;
public class Program37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Hexadecimal Input:-");
		String hexaDecimal = sc.nextLine();
		int decimal = convertToDecimal(hexaDecimal);
		System.out.println("The HexaDecimal ("+hexaDecimal+") converted to Decimal is :"+decimal);
	}
	public static int convertToDecimal(String hexaDecimal) {
		int val = 0;
		String digits = "0123456789ABCDEF";
		hexaDecimal = hexaDecimal.toUpperCase();
		for(int i = 0 ; i< hexaDecimal.length(); i++) {
			char c = hexaDecimal.charAt(i);
			int d = digits.indexOf(c);
			val = 16 * val + d;
		}
		return val;
	}
}

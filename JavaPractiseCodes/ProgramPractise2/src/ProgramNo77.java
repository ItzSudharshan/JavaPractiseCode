//Program to Convert Decimal to Octal 
import java.util.*;
public class ProgramNo77 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Decimal Number");
		int decimal = sc.nextInt();
		String octal = getOctal(decimal);
		System.out.println("The Octal Number of the Given Decimal Number("+decimal+") is "+octal);
	}
	public static String getOctal(int decimal) {
		if(decimal == 0) {
			return "0";
		}
		
		StringBuilder octal = new StringBuilder();
		while(decimal > 0) {
			int rem = decimal % 8;
			octal.insert(0, rem);
			decimal = decimal / 8;
		}
		return octal.toString();
	}
}

//Program to Convert Decimal to Binary 
import java.util.*;
public class ProgramNo76 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Decimal Number:");
		int decimal = sc.nextInt();
		String binary = getbinary(decimal);
		System.out.println("The Binary Number of the Given Decimal Number("+decimal+") is "+binary);

	}
	
	public static String getbinary(int decimal) {
		if( decimal == 0) {
			return "0";
		}
		StringBuilder binary = new StringBuilder();
		while(decimal > 0) {
			int rem = decimal % 2;
			binary.insert(0, rem);
			decimal = decimal/2;
		}
		return binary.toString();
	}

}

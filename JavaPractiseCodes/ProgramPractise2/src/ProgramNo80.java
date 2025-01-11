//program to Convert Octal to Binary 
import java.util.*;
public class ProgramNo80 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Octal");
		int octal = sc.nextInt();
		int decimal = getDecimal(octal);
		String binary = getBinary(decimal);
		System.out.println("The Binary Number of the Given Octal Number("+octal+") is "+binary);
	}
	
	public static int getDecimal(int octal) {
		int decimal = 0 ;
		int n = 0 ;
		while(octal > 0) {
			int rem = octal % 10;
			decimal = decimal + (int)(rem*Math.pow(8,n));
			octal = octal / 10;
			n++;
		}
		return decimal;
	}
	
	public static String getBinary(int decimal) {
		if(decimal == 0) {
			return "0";
		}
		
		StringBuilder binary = new StringBuilder();
		while(decimal > 0) {
			int rem = decimal % 2;
			binary.insert(0, rem);
			decimal = decimal / 2;
		}
		return binary.toString();
	}
}

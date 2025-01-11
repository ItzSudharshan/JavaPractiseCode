//Porgram to Convert Binary to Octal
import java.util.*;
public class ProgramNo79 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Binary Number:");
		int binary = sc.nextInt();
		int decimal = getDecimal(binary);
		String Octal = getOctal(decimal);
		System.out.println("The Octal Number of the Given binary Number("+binary+") is "+Octal);

	}
	public static int getDecimal(int binary) {
		int decimal= 0;
		int n = 0;
		while(binary > 0) {
			int rem = binary % 10 ;
			decimal = decimal + (int)(rem*Math.pow(2, n));
			binary = binary/10;
			n++;
		}
		return decimal;
	}
	
	public static String getOctal(int decimal) {
		if(decimal == 0) {
			return "0";
		}
		
		StringBuilder octal = new StringBuilder();
		while(decimal > 0) {
			int rem = decimal % 8;
			octal.insert(0, rem);
			decimal = decimal/8;
		}
		return octal.toString();
	}

}

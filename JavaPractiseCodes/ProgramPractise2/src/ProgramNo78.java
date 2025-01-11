//Program to convert Decimal to HexaDecimal 
import java.util.*;
public class ProgramNo78 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Decimal:");
		int decimal = sc.nextInt();
		String hexaDecimal = gethex(decimal);
		System.out.println("The HexaDecimal Number of the Given Decimal Number("+decimal+") is "+hexaDecimal);
	}
	
	public static String gethex(int decimal) {
		if(decimal == 0) {
			return "0";
		}
		
		StringBuilder hexa = new StringBuilder();
		while(decimal > 0) {
			int rem = decimal % 16;
			char hex;
			
			if(rem < 10) {
				hex = (char)('0' + rem);
			}else  {
				hex = (char)('A' + rem - 10);
			}
			hexa.insert(0, hex);
			decimal = decimal/16;
			
		}
		return hexa.toString();
		
	}

}

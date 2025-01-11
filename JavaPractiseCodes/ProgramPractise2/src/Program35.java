//Java Program to Convert from Binary to Decimal 
import java.util.*;
public class Program35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Binary Number:");
		int binary  = sc.nextInt();
		int decimal = convertToDecimal(binary);
		System.out.println("The Binary Number ("+binary+") converted to Decimal is :"+decimal);

	}
	
	public static int convertToDecimal(int binary) {
		int decimal = 0;
		int n = 0;
		while(binary > 0) {
			int temp = binary % 10;
			decimal = decimal + (int)(temp * Math.pow(2, n));
			binary = binary/10;
			n++;
		}
		return decimal;
		
	}

}

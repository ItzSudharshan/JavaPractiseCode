import java.util.*;
public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Decimal Value");
		int decimal = sc.nextInt();
		String binary = getBinary(decimal);
		System.out.println("The Binary of the Decimal value "+decimal+" is "+binary);

	}
	public static String getBinary(int decimal) {
		if(decimal == 0) {
			return "0";
		}
		
		StringBuilder Binary = new StringBuilder();
		while(decimal > 0) {
			int rem = decimal % 2;
			Binary.insert(0, rem);
			decimal = decimal/2;
		}
		return Binary.toString();
	}

}

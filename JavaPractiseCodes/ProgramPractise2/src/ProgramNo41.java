//Java program to Convert Number to Words
import java.util.*;
public class ProgramNo41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num = sc.nextInt();
		if(num < 0 || num > 9999) {
			System.out.println("Enter the Number from the range 0 to 9999");
		}else {
			String result = converToWords(num);
			System.out.println("Number ("+num+") in words is " +result);
		}


	}
	public static String converToWords(int num) {
		String[] words1to19 = {" ", "One", "Two", "Three", "Four", "Five", "Six", "Seven","Eight", "Nine", "Ten", "Eleven", "Tweleve",
				"Thirteen", "Fourteen", "Fifteen","Sixteen", "Seventeen", "Eighteen","NineTeen"};
		String[] words10to90 = {" "," ","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety"};
		
		if(num == 0) {
			return "Zero";
		}
		String words = " ";
		
		if(num >=1000 ) {
			words = words + words1to19[num / 1000]+ "\tThousand\t";
			num = num % 1000;
		}
		
		if(num >=100  ) {
			words = words + words1to19[num / 100]+ "\tHundred\t";
			num = num % 100;
		}
		
		if(num > 0) {
			if(num < 20) {
				words = words + words1to19[num];
			}else {
				words = words + words10to90[num / 10] + " " + words1to19[num % 10];
			}
		}
		return words.trim();
	}
}

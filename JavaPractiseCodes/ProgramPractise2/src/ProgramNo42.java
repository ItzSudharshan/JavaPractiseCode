//Program to Find the Number of Days in a Month Given the year
import java.util.*;
public class ProgramNo42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Year:");
		int year = sc.nextInt();
		System.out.println("Enter the Month Number of :" + year + "->");
		int month = sc.nextInt();
		if(month > 12) {
			System.out.println("Enter the Month Number from 1 to 12");	
		}else {
			if(((month == 2) && (year % 4 == 0)) || ((year % 100 != 0) && (year % 400 == 0))){
				System.out.println("The Number of days is 29");
			}else if(month == 2) {
				System.out.println("The Number of days is 28");
			}else if(month == 1 ||  month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
				System.out.println("The Number of days is 31");
			}else {
				System.out.println("The Number of days in 30");
			}
		}
		

	}

}

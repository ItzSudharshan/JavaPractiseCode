import java.util.*;
public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		int numLength = getLength(num);
		if(isArmstrong(num,numLength)) {
			System.out.println(num+ " is an Armstrong Number");
		}else {
			System.out.println(num+ " is not an Armstrong Number");
		}

	}
	public static int getLength(int num) {
		int length = 0;
		while(num != 0) {
			num = num / 10;
			length++;
		}
		return length;
	}
	public static boolean isArmstrong(int num,int numLength) {
		int sum = 0;
		int digit, temp;
		temp = num;
		while(temp != 0) {
			digit = temp % 10;
			sum = sum + (int)Math.pow(digit, numLength);
			temp = temp/10;
		}
		return num == sum;
	}

}

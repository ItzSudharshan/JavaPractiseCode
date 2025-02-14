import java.util.*;
public class StringRotationCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the String1");
		String str1 = sc.nextLine();
		System.out.println("Enter the String2");
		String str2 = sc.nextLine();
		if(isStringRotation(str1,str2)) {
			System.out.println(str2+"is the String Rotation of "+str1);
		}else {
			System.out.println(str2+"is not the String Rotation of "+str1);
		}

	}
	
	public static boolean isStringRotation(String str1,String str2) {
		if(str1.length() != str2.length()) {
			return false;
		}
		return (str1 + str2).contains(str2);
	}

}

/*
Enter the String1
HelloWorld
Enter the String2
WorldHello
WorldHellois the String Rotation of HelloWorld


*/
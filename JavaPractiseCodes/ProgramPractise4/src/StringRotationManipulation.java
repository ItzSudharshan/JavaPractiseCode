import java.util.*;
public class StringRotationManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str = sc.nextLine();
		System.out.println("Enter the Position:");
		int position = sc.nextInt();
		System.out.println("Enter the Direction(Left/Right)");
		sc.nextLine();
		String direction = sc.nextLine();
		String result = getRotation(str, position, direction);
		System.out.println("The resultant String after Rotation is :" + result);

	}
	public static String getRotation(String str,int position,String direction) {
		int length = str.length();
		position = position % length;
		if(direction.equalsIgnoreCase("left")) {
			return str.substring(position) + str.substring(0, position); 
		}else if(direction.equalsIgnoreCase("right")) {
			return str.substring(length - position) + str.substring(0, length - position);
		}else {
			return str;
		}
	}

}

/*
OUTPUT:
Enter the String:
HelloWorld
Enter the Position:
3
Enter the Direction(Left/Right)
left
The resultant String after Rotation is :loWorldHel
---------------------------------------------------

Enter the String:
HelloWorld
Enter the Position:
2
Enter the Direction(Left/Right)
right
The resultant String after Rotation is :ldHelloWor
-------------------------------------------------------

*/
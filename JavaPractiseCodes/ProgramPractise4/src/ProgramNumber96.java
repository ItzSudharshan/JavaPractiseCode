import java.util.Scanner;
public class ProgramNumber96 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of x");
		int x = sc.nextInt();
		System.out.println("Enter the Value of y");
		int y = sc.nextInt();
		int count = 0;
		for(int i = x; i<=y ; i++) {
			if(i % x == 0) {
				count++;
			}
			
		}
		System.out.println(count);
		sc.close();
	}
	
}
/*
 * 
 *
Enter the value of x
3
Enter the Value of y
20
6

 */

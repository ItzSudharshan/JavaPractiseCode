import java.util.*;
public class ProgramNo99 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Enter the Size of the Array:");
		int size = sc.nextInt();
		int workload[] = new int[size];
		
		System.out.println("Enter the Working hrs");
		for(int i = 0 ; i< size; i++) {
			workload[i] = sc.nextInt();
		}
		
		int maxStreak = 0;
		int currentStreak = 0;
		for(int i = 0 ; i< size; i++) {
			if(workload[i] > 6) {
				currentStreak++;
				maxStreak = Math.max(currentStreak, maxStreak);
			}else {
				currentStreak = 0;
			}
		}
		System.out.println("Length of the Longest Interval: "+maxStreak);
	}

}

/*
Enter the Size of the Array:
12
Enter the Working hrs
2 3 7 8 7 6 3 8 12 11 12 10
Length of the Longest Interval: 5
-----------------------------------

Enter the Size of the Array:
10
Enter the Working hrs
5 5 5 7 7 7 5 5 5 5
Length of the Longest Interval: 3

*/
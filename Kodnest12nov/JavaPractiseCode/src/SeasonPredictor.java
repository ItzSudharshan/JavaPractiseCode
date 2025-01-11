import java.util.*;
public class SeasonPredictor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Month Number");
		int month = sc.nextInt();
		String season;
		switch(month) {
		case 12 : case 1 : case 2 :
				season = "Winter";
				break;
		case 3 : case 4: case 5:
				season = "Spring";
				break;
		case 6: case 7: case 8:
				season = "Summer";
				break;
		case 9: case 10: case 11:
				season = "Fall";
				break;
		default: System.out.println("The Month Number "+month+" doesnt correspond to any season");
					return;
		}
		System.out.println("The Month Number "+month+" corresponds to "+season+" season");

	}

}

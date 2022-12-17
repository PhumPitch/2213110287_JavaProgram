import java.util.*;
public class Lab607 {
	static Scanner scan = new Scanner(System.in);
	static String month[] = { "January", "February", "March", "April", "May", "June", "July", "August", "September","October", "November", "December" };
	static int count[] = new int[12];
	public static void main(String[] args) {
		inputBirthDate();
		

	}
	public static void inputBirthDate() {
		for (int i = 0; i < 5; i++) {
			System.out.print("Enter Birth Date "+(i+1) +" :");
			String dateSTR = scan.nextLine();
			int bmonth = checkBirthDate(dateSTR);
			count[bmonth-1]++;
		} 
		System.out.println();
		displayCountBday();
		
	}
	public static int checkBirthDate(String date) {
		int month = Integer.parseInt((date.substring(3,5)));
		
		return month;
	}
	public static void displayCountBday() {
		for(int i = 0; i < month.length;i++) {
			System.out.println(month[i] + "  ["+count[i]+" people]");
		}
	}

}

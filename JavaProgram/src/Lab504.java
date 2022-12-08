import java.util.*;

public class Lab504 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter your name, separated by a space.\n:");
		String fullname = scan.nextLine();
		String firstName = fullname.substring(0, fullname.indexOf(" "));
		System.out.println(abbreviatName(fullname)+firstName);
	}// end of method
	public static String abbreviatName(String name){
		String initialsName = "";
		for(int i = 0; i < name.length(); i++) {
			if(name.charAt(i)== ' ') {
			 initialsName = (initialsName + (name.charAt(i+1))).toUpperCase()+".";
			}			
		}

		return initialsName;
	}
}

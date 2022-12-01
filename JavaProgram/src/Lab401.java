import java.util.*;

public class Lab401 {

	public static void main(String[] args) {
		String firstName, lastName;
		Scanner scan = new Scanner(System.in);
		System.out.print("Full name: ");
		String fullName = scan.nextLine();
		fullName = fullName.trim();
		int space = fullName.indexOf(' ');
		if (space == -1) {
			System.out.print("Incorrect Name");
		} else {

			firstName = fullName.substring(0, space);
			lastName = fullName.substring(space + 1, fullName.length());
			System.out.println("First Name: " + firstName.toUpperCase());
			System.out.println("Last  Name: " + lastName.toLowerCase());

		}
	}

}

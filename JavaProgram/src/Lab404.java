import java.util.*;

public class Lab404 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Text : ");
		String sentence = scan.nextLine();
		sentence = sentence.replace(" ", "");
		String mess = sentence.toLowerCase();
		String l = "", r = "";
		for (int i = sentence.length() - 1; i >= 0; i--) {
			if (!(mess.indexOf(i) == ' ')) {
				r = r + mess.charAt(i);
			}
		}
		System.out.println(mess);
		System.out.println(r);
		if (r.equals(mess)) {
			System.out.print("This is palindrome");
		} else {
			System.out.print("This is not palindrome");

		}

	}

}

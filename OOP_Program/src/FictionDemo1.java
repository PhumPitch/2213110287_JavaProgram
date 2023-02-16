import java.util.*;

public class FictionDemo1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Book : ");
		String title = scan.nextLine();
		System.out.print("Enter Public Year : ");
		int publicYear = scan.nextInt();
				
		FictionBook book = new FictionBook(title,publicYear);

		System.out.print("Enter Author Name : ");
		String author = scan.nextLine();
		scan.nextLine();
		System.out.print("Enter e-Mail : ");
		String email = scan.nextLine();
		
		book.setAuthorName(author);
		book.setEmail(email);
		
		System.out.println(book);
	}

}

import java.util.*;

public class AuthorDemo2 {

	public static void main(String[] args) {
		Author[] aut = new Author[4];
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 4; i++) {
			System.out.println("Information Author "+(i+1));
			Line();
			System.out.print("Input author name    : ");
			String name = scan.nextLine(); 
			System.out.print("Input author e-mail  : ");
			String mail = scan.nextLine(); 
			aut[i] = new Author(name, mail);
			Line();
		}
		System.out.println();
		int i = 1;
		for (Author _aut : aut) {
			System.out.println(i+". "+ _aut.getName() + "("+ _aut.getEmail()+")");
		}
		
	}

	public static void Line() {
		System.out.println("------------------------------------------");
	}
	
}

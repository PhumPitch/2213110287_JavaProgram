import java.util.*;
public class BookDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Book book1 = new Book();
		
		System.out.print("Input book title : ");
		book1.setTitle(scan.nextLine());
		
		System.out.print("Input book price : ");
		book1.setPrice(scan.nextFloat());
		
		System.out.print("Input publish year : ");
		book1.setPublishyear(scan.nextInt());
		System.out.println();
		
		System.out.println(book1);

	}

}

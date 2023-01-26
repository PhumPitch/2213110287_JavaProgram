import javax.swing.*;

public class BookDemo2 {

	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("Input author name: ");
		String email = JOptionPane.showInputDialog("Input author email: ");
		String title = JOptionPane.showInputDialog("Input book title: ");
		int page = Integer.parseInt(JOptionPane.showInputDialog("Input book page: "));
		
		Book1 book = new Book1(title, new Author1(name,email),page);
		
		int checkPage = JOptionPane.showConfirmDialog(null,"Is the page correct?");
		while(checkPage == 1) {
			book.setPage(Integer.parseInt(JOptionPane.showInputDialog("Input book page, again: ")));
			checkPage = JOptionPane.showConfirmDialog(null,"Is the page correct?");
			
		}
		
		JOptionPane.showMessageDialog(null,
				"Book Title : " + book.getTitle()+
				"\nAuthor name : " + book.getAuthor().getName()+" ("+ book.getPage() +" page)"+
				"\nAuthor e-mail : "+  book.getAuthor().getEmail());
		//
		
	}

}

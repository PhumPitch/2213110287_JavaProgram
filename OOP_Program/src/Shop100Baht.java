import javax.swing.*;

public class Shop100Baht {
	public static void main(String[] args) {
		Product100B arnupab = new Product100B();
		int choice = JOptionPane.showConfirmDialog(null, "Is the program run on Pattanakarn Branch?");
		if(choice == 0) {
			 arnupab = new PattanakarnBranch();
		}
			
		arnupab.setUnit(Integer.parseInt(JOptionPane.showInputDialog(null, "Input hte number of product")));
		JOptionPane.showMessageDialog(null, arnupab);
	}
}

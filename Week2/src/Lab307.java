import javax.swing.*;

public class Lab307 {

	public static final int VANILLA = 10, CHOCOLATE = 15, TOPPING = 5;

	public static void main(String[] args) {
		int iceCream = Integer.parseInt(JOptionPane.showInputDialog(
				"[1] Vanilla flavor 10 B." + "\n[2] Chocolate flavor 15 B." + "\n Press number to choose flavor : "));
		while (iceCream != 1 && iceCream != 2) {
			JOptionPane.showMessageDialog(null, "ERROR: Wrong Choice!" + "Try Again...", "ERROR",
					JOptionPane.ERROR_MESSAGE);

			iceCream = Integer.parseInt(JOptionPane.showInputDialog("[1] Vanilla flavor 10 B."
					+ "\n[2] Chocolate flavor 15 B." + "\n Press number to choose flavor : "));
		}

		String iceCreamSTR = (iceCream == 1) ? "Vanilla flavor" : "Chocolate flavor";
		int iceCreamPrice = (iceCream == 1) ? VANILLA : CHOCOLATE;
		int topping = JOptionPane.showConfirmDialog(null, "Do you want to add topping?");
		String toppingSTR = (topping == 0) ? "And with topping" : "And no topping";
		int totalPrice = (topping == 0) ? iceCreamPrice + TOPPING : iceCreamPrice;
		JOptionPane.showMessageDialog(null,
				"You choose " + iceCreamSTR + "\n" + toppingSTR + 
				"\nTotalprice = "+ totalPrice + "baht..");
	}
}

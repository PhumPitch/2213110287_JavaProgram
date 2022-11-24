import javax.swing.JOptionPane;

public class MusicWorldApp {
	static final double TAX_RATE = .0625 ;
	public static void main(String[] args) {
		
		String cdID = JOptionPane.showInputDialog("This progeam calculates the total cost of a CD"
				+ " order" +"\nPlease enter the ID of the CD" );
		String cdTitle = JOptionPane.showInputDialog("Please enter the title of the CD");
		double cdPrice = Double.parseDouble(JOptionPane.showInputDialog("Please enter the price of the CD in U.S. dollars"));
		int cdQuantity = Integer.parseInt(JOptionPane.showInputDialog("Please enter the quantity to be purchased"));
		
		double subTotal = cdPrice*cdQuantity;
		double taxRate = TAX_RATE*100;
		double total = subTotal + (subTotal*TAX_RATE);
		
		JOptionPane.showMessageDialog(null, "Summary of the transacttion:"
					+ "\n\nCD ID: "+ cdID 
					+ "\nCD Title: "+ cdTitle + 
					"\nCD Unit Price:$"+cdPrice+
					"\nCD Quantity: " + cdQuantity +
					"\n\nSubtotal: $" + subTotal +
					"\nTax rate: "+taxRate+"%"+
					"\nTotal: $"+total+
					"\n\nEnd of Program");
		
	}

}

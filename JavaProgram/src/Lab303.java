import java.util.*;
import javax.swing.*;
import java.text.*;

public class Lab303 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###");
		Random rand = new Random();
		int balance = rand.nextInt(9) * 100000;
		int numberWithDraw = Integer.parseInt(JOptionPane.showInputDialog("Your balance : " + balance+"\nInput money to withdraw"));
		if (numberWithDraw > balance) {
			JOptionPane.showMessageDialog(null,			
					"Error: Cannot withdraw more than blance",
					"ERROR"
					,JOptionPane.ERROR_MESSAGE);
		}
		else if (numberWithDraw > 20000) {
			JOptionPane.showMessageDialog(null,			
					"Error: Cannot withdraw more than 20,000",
					"ERROR"
					,JOptionPane.ERROR_MESSAGE);
		}
		else if (numberWithDraw%100 !=0) {
			int extraWithdraw = numberWithDraw%100;
			JOptionPane.showMessageDialog(null,			
					"Error: Cannot withdraw " + extraWithdraw +" baht." ,
					"ERROR"
					,JOptionPane.ERROR_MESSAGE);
		}
		else {
				int thousandWithdraw = numberWithDraw/1000;
				int fhundredWithdraw = (numberWithDraw%1000)/500; //17900 900/500 1
				int hundredWithdraw = (numberWithDraw%500)/100; //17900 400/100 4
			
			JOptionPane.showMessageDialog(null,			
					"You withdraw " + frm.format(numberWithDraw)+" baht."+
					"\n1,000 = "+ thousandWithdraw+
					"\n500 = "+ fhundredWithdraw+
					"\n100 = " + hundredWithdraw);   
			
			
		}
	}

}

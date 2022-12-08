import javax.swing.*;             
import java.text.*;
public class Lab302 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("##.#");
		double weight = Double.parseDouble(JOptionPane.showInputDialog("Input Weight:"));
		double height = Double.parseDouble(JOptionPane.showInputDialog("Input Height:"));
		double bmi = weight/Math.pow((height/100),2);
		String message = (bmi >= 30.0)?"Obesity":(bmi >= 25.0)?"Overweight":(bmi >= 18.5)?"Normal-weight":"Underweight";
		JOptionPane.showMessageDialog(null, 
				"BMI = " +frm.format(bmi) + "\n You're " + message,	
				"BMI",
				JOptionPane.WARNING_MESSAGE);
		
		
		
		
	}

}

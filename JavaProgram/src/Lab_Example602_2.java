import javax.swing.*;

public class Lab_Example602_2 {
	static String[] deptName = {"Accounting","HR","Sales","Innovation"};
	static Boolean deptCHK = false;
	
	public static void main(String[] args) {
		String deptInput = JOptionPane.showInputDialog("Enter a department name : ");
		for (String dept : deptName) {
			if(dept.equalsIgnoreCase(deptInput)) {
				deptCHK = true;
			}
		}
		JOptionPane.showMessageDialog(null, (deptInput + ((deptCHK)?" was ":" was not ") +"found in the list"));

	}

}

import java.util.*;
import java.text.*;

public class PensionContributionCalculator {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#.00");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the monthly salary: $");
		double employeeCon=0,employerCon = 0,totalContribution = 0;
		int monthlySalary = scan.nextInt();
		if (monthlySalary > 6000) {
			monthlySalary = 6000;
		}
		System.out.print("Enter the age: ");
		int employAge = scan.nextInt();
		
		
		if (employAge <= 55) {
			 employeeCon =  monthlySalary*20/100.0;
			 employerCon = monthlySalary*17/100.0;
			 totalContribution = employeeCon + employerCon;
			
			
		}
		else if (employAge > 55 && employAge <= 60) {
			 employeeCon =  monthlySalary*13/100.0;
			 employerCon = monthlySalary*13/100.0;
			 totalContribution = employeeCon + employerCon;

		}
		else if (employAge > 60 && employAge <= 65) {
			 employeeCon =  monthlySalary*7.5/100.0;
			 employerCon = monthlySalary*9/100.0;
			 totalContribution = employeeCon + employerCon;

		}
		else if (employAge > 65) {
			 employeeCon =  monthlySalary*5/100.0;
			 employerCon = monthlySalary*7.5/100.0;
			 totalContribution = employeeCon + employerCon;

		}
		System.out.print("The employee's contribution is: $"+ frm.format(employeeCon)+
				"\nThe employer's contribution is: $"+frm.format(employerCon)+
				"\nThe total contribution is: $"+ frm.format(totalContribution));


}
	
}

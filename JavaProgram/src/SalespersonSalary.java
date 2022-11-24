import java.util.*;
import java.text.*;

public class SalespersonSalary {
	final static double COMMISSION_RATE = 0.15;
	final static int SENTINEL = -1;

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("Enter sales in dollars (or -1 to end):");
			int sales = scan.nextInt();
			if (sales == SENTINEL) {
				break;
				}
			double salary = 1000 + sales*COMMISSION_RATE;
			System.out.println("Salary is $"+ frm.format(salary));
			
		}
		System.out.print("bye");
		

	
	}
}

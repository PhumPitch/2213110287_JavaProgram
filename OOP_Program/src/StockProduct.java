import java.util.*;
import java.text.*;

public class StockProduct {
	static DecimalFormat frm = new DecimalFormat("#,###.00");
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product[] productList = new Product[4];
		for (int i = 0; i < productList.length; i++) {
			productList[i] = new Product();
			System.out.print("Input product Id    : ");
			productList[i].setId(scan.next());
			System.out.print("Input product Unit  : ");
			productList[i].setUnit(scan.nextInt());
			System.out.print("Input product Price : ");
			productList[i].setPrice(scan.nextDouble());
			while (productList[i].getPrice() <= 0) {
				System.out.print("Input product Price, again : ");
				productList[i].setPrice(scan.nextDouble());
			}
			System.out.println();
		} // end for
		System.out.println("--------------------------------------");
		double sum = 0;
		for (Product pdl : productList) {
			System.out.println(
					"Product ID : " + pdl.getId() + ", Total price = " + frm.format(pdl.calculate()) + " baht.");
			sum += pdl.calculate();
		}
		System.out.println("--------------------------------------");
		System.out.println("Total price of all products is " + frm.format(sum) + " baht.");
	}
}

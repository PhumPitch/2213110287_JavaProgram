import java.util.*;

public class CheckStockProduct {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("How many product list in stock : ");
		int stockList = scan.nextInt();
		System.out.println();
		Product[] checkStock = new Product[stockList];
		for (int i = 0; i < checkStock.length; i++) {

			checkStock[i] = new Product();
			System.out.print("Input product Id    : ");
			checkStock[i].setId(scan.next());
			System.out.print("Input product Unit  : ");
			checkStock[i].setUnit(scan.nextInt());
			System.out.println();

		} // end for
		System.out.println("-------------------------------");
		System.out.println("List of product in \'LOW\' status.");
		System.out.println("-------------------------------");
		for (Product chkStock : checkStock) {
			if (chkStock.getUnit() < 5)
				System.out.println(">> "+chkStock.getId() + " has " + chkStock.getUnit() + " units");
		}
		System.out.println("-------------------------------");
		System.out.println("List of product in \'NORMAL\' status.");
		System.out.println("-------------------------------");
		for (Product chkStock : checkStock) {
			if (chkStock.getUnit() >= 5 && chkStock.getUnit() <= 50 )
				System.out.println(">> "+chkStock.getId() + " has " + chkStock.getUnit() + " units");
		}
		System.out.println("-------------------------------");
		System.out.println("List of product in \'HIGH\' status.");
		System.out.println("-------------------------------");
		for (Product chkStock : checkStock) {
			if (chkStock.getUnit() > 50 )
				System.out.println(">> "+chkStock.getId() + " has " + chkStock.getUnit() + " units");
		}


	}
}
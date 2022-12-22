import java.util.*;

public class CheckStockProduct {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("How many product list in stock : ");
		int stockList = scan.nextInt();
		Product[] checkStock = new Product[stockList];
		for (int i = 0; i < checkStock.length; i++) {

			checkStock[i] = new Product();
			System.out.print("Input product Id    : ");
			checkStock[i].setId(scan.next());
			System.out.print("Input product Unit  : ");
			checkStock[i].setUnit(scan.nextInt());
			System.out.println();

		}//end for
		System.out.println("-------------------------------");
	}
}

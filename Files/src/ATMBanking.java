import java.util.*;
import java.io.*;

public class ATMBanking {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		System.out.print("Enter account number    : ");
		String accNum = scan.next();
		while (accNum.charAt(1) != '-' && accNum.charAt(5) != '-' && accNum.charAt(9) != '-'
				&& accNum.charAt(12) != '-') {

		}
		System.out.print("Enter password    : ");
		String password = scan.next();
		while (password.length() != 4) {
			System.out.print("Enter password    : ");
			password = scan.next();
		}
		System.out.print("Enter money    : ");
		int money = scan.nextInt();
		while (money < 0 && money % 100 == 0) {
			System.out.print("Enter money    : ");
			money = scan.nextInt();
		}
		System.out.println();
		ATMChecking atm = new ATMChecking(accNum, password, money);

		if (atm.CheckBookBank()) {
			atm.show();
		} else {
			System.err.println("Sorry, Your id or password is wrong, or your amount not enough.");
		}
	}
}

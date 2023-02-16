import java.io.*;
import java.util.*;

public class ATMChecking extends ATMData {
	private int money;

	public ATMChecking(String acc, String pass, int money) {
		super(acc, pass);
		this.money = money;
	}
	
	public boolean CheckBookBank() throws IOException{

		Scanner read = new Scanner(new File("ATMBookbank.txt"));
		
		return super.getID().equals(read.next())&&
				super.getPass().equals(read.next())&&money <= read.nextInt()
				?true:false;
	}
	public void show() {
		System.out.printf("You're drawing for " + money);
		System.out.println("\t1000 = "+money/1000
						+ "\t500 = "+(money/1000 )% 500
						+ "\t100 = "+(money/1000 )% 100) ;
	}
}

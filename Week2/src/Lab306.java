import java.util.*;
import java.text.*;

public class Lab306 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("00");
		Scanner scan = new Scanner(System.in);
		System.out.print("How many number per line : ");
		int line = scan.nextInt();
		System.out.println();
		for (int i = 1; i <= 100; i++) {
			System.out.print((i % (line) == 0)?" "+ (frm.format(i))+"\n":" "+(frm.format(i)));
		}
		

	}

}

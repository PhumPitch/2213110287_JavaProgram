import java.util.*;

public class Lab305 {

	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.print("Input of value of X : ");
			int x = scan.nextInt();
			System.out.print("Input of value of Y : ");
			int y = scan.nextInt();
			while(y<=x) {
				System.out.print("Input of value of Y, again : ");
				y = scan.nextInt();
			}
			System.out.println();
			int sum = x;
			
			for(int i = x; i < y ; i++) {
				
				sum += (i+1);
				System.out.println(x +" + "+ (i+1) + " = " + sum);
				x = sum;
				
			}
	}

}

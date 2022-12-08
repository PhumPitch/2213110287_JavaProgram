import java.util.*;

public class Lab304 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input number : ");
		int number = scan.nextInt();
		System.out.print("Input number : ");
		int number2 = scan.nextInt();
		while(number < number2) {
			System.out.print("Input number : ");
			number2 = scan.nextInt();
		}
		System.out.println();
		System.out.println("BYE BYE");
		
	}
	
}

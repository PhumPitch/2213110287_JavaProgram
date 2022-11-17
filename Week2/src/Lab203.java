import java.util.*;

public class Lab203 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input two integers(a b):");
		
		int number1 = scan.nextInt();
		int number2 = scan.nextInt();
			
		int sumInt = number1+number2;
		System.out.println("Sum of two integers: " + sumInt);
		
		int count = 0;
		while(sumInt != 0) 
		{
			sumInt /= 10;
			count++;
			
		}
		System.out.println("Digit number of sum of said two intergers: " + count );
	}

}

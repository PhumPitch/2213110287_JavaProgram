import java.util.*;

public class Lab_Example603 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] number = new int[5];
		for (int i = 0; i < number.length;i++) {
			System.out.print("Input number " + (i+1) + " : ");
			number[i] = scan.nextInt();
		}// end for
		System.out.println();
		System.out.println("Summation of positive number is " + sumOfPos(number));
		
	}
	public static int sumOfPos(int[] nums) {
		int sum = 0;
		for (int _nums : nums) {
			if(_nums > 0)sum += _nums;
		}
		return sum;
	}

}

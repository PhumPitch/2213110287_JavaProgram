import java.util.*;
public class Lab403 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Message : ");
		String message = scan.nextLine();
		String mes = message.toLowerCase();
		if(mes.indexOf("nichi")>=0) {
			System.out.print("Nichi is a sentence.");
		}
		else {
			System.out.print(message);
		}
		
	}

}

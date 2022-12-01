import java.util.*;

public class Lab402 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input some sentence : ");
		String txtSentence = scan.nextLine();
		String words = "";
		while (!txtSentence.endsWith(".")){
			System.out.print("The sentence must end with full stop point : ");
			txtSentence = scan.nextLine();
		}
		int space = 0;
		for (int i = 0; i < txtSentence.length(); i++) {
			if(txtSentence.charAt(i) == ' '){
				System.out.println(txtSentence.substring(space,i));
				space = i+1;

			}
			
		}
		System.out.print(txtSentence.substring(space));
	}

}

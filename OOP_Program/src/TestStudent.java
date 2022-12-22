import java.util.*;

public class TestStudent {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("How many student in classroom : ");
		int studentNum = scan.nextInt();
		
		System.out.println();
		
		Student[] std = new Student[studentNum];//array object
		for (int i = 0; i <std.length; i++) {
			std[i] = new Student(); //declare array object, call method in class student
			System.out.print("Input student name : ");
			std[i].setName(scan.next());
			System.out.print("Input student score : ");
			std[i].setScore(scan.nextInt());
			while(!std[i].checkScore()) {
				System.out.print("Input student score, again : ");
				std[i].setScore(scan.nextInt());
			}//end while
			System.out.println("----------------------------");
		}//end for
		
		for (Student _std : std) {
				System.out.print((_std.isPass()?">> "+_std.getName()+" get grade "+findGrade(_std.getScore())+"\n":""));
			
		}
		/*for (int i = 0; i <std.length;i++) {
			if(std[i].isPass()) {
				System.out.println(">> "+std[i].getName()+" ("+std[i].getScore()+")");
			}
		}*/

	}
	public static String findGrade(int score) {
		return(score <= 49)?"F":(score <= 54)?"D":(score <= 59)?"D+":(score <= 64)?"C":(score <= 69)?"C+":
			(score <= 74)?"B":(score <= 79)?"B+":"A";
		
	}
}

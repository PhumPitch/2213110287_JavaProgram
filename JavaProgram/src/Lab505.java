import java.util.*;

public class Lab505 {

	public static void main(String[] args) {
		
		inputStudent();
	}
	public static void inputStudent() {
		Scanner scan = new Scanner(System.in);
		String studentID;
		int subjectID;
		do {
		System.out.println("Enter Student ID : ");
		studentID = scan.nextLine();
		System.out.println("Enter Subject ID : ");
		subjectID = scan.nextInt();
		}while(isLength(studentID,subjectID));
		System.out.println();
		boolean stuID = isITStudent(studentID);
		boolean subID = isITSubject(subjectID);
		displayData(stuID,subID,studentID);

	}
	public static boolean isLength(String val,int val2) {
		String stringInt = val2+"";
		if (val.length()!=10 && stringInt.length() != 7) return true;
		else return false;
	}
	public static boolean isITStudent(String stdID)
	{
		if(stdID.substring(0,3).equals("221") && stdID.substring(3,6).equals("311")) return true;
		else return false;
	}
	public static boolean isITSubject(int subID)
	{
		String strID = subID+"";
		if(strID.substring(0,2).equals("21") && strID.substring(4,5).equals("1")) return true;
		else return false;
	}
	public static void displayData(boolean stu,boolean subject,String stuID) {
		System.out.println("Student id: "+ stuID +
				((stu)?"":" is not") + " 1st year student in IT" +
				"\n"+((subject)?"":"not "+ "Enroll in courses for Year 1"));
		
	}

}

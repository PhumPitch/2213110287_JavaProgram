
public class StudentII {
	//private instance variables
	private String name;
	private String address;
	// the course taken and kept in 2 parallel
	private String[] courses;
	private int[] grades; // valid range 0 - 100;
	private int numCourse; //numbers of courses taken so far
	private static final int MAX_COURSE = 30; // Maximum number of course taken by student
	
	/*Construcs a Studnet instatnace*/
	
	public StudentII(String name,String address) {
		this.name = name;
		this.address = address;
		courses = new String[MAX_COURSE];
		grades = new int[MAX_COURSE];
		numCourse = 0;
		
	}
	
	//The public getter and setters.
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
		
	}
	public String getAddress() {
		return this.address;
	}
	
	public void setAddress(String address) {
		this.address = address;
		
	}
	public String toString() {
		return name + " (" + address + ")";
	}
	
	public void addCourseGrade(String course,int grade) {
		courses[numCourse] = course;
		grades[numCourse] = grade;
		++numCourse;
	}             
	
	public void printGrades() {
		System.out.print(name);
		for(int i = 0; i < numCourse; i++) {
			System.out.print(" "+courses[i]+":"+grades[i]);
		}
		System.out.println();
	}
	public double getAverageGrade() {
		int sum = 0;
		for(int i = 0; i < numCourse; i++) {
			sum += grades[i];
		}
		return (double)sum / numCourse;
	}
	
}


public class TestStudentII {

	public static void main(String[] args) {
		// Test constructor and toString
		StudentII pitchy = new StudentII("Pitchphum Rk","85 Nasan rd.");
		System.out.println(pitchy);
		
		//Test setter and getter
		pitchy.setAddress("1411, 40 Pattanakan rd.");
		System.out.println(pitchy);
		System.out.println(pitchy.getName());
		System.out.println(pitchy.getAddress());

		//test ad course
		pitchy.addCourseGrade("INT-107", 92);
		pitchy.addCourseGrade("INT-108", 89);
		pitchy.addCourseGrade("MSC-112",99);
		pitchy.printGrades();
		
		System.out.printf("\nThe average grade is %.2f%n",pitchy.getAverageGrade());

	}

}

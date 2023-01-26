
public class Date {
	private int dMonth;
	private int dDay;
	private int dYear;

	public Date() { // set var to default
		dDay = 1;
		dMonth = 1;
		dYear = 1900;

	}

	public Date(int month, int day, int year) {
		dMonth = month;
		dDay = day;
		dYear = year;
	}

	public void setDate(int month, int day, int year) {
		dMonth = month;
		dDay = day;
		dYear = year;
	}

	public int getMonth() {
		return dMonth;
	}

	public int getDay() {
		return dDay;
	}

	public int getYear() {
		return dYear;
	}

	// mm-dd-yyyy
	public String toString() {
		return getMonth() + "-" + dDay + "-" + getYear();
	}
}
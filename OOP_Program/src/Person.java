
public class Person {
	private String firstName;
	private String lastName;

	public Person() {
		firstName = "";
		lastName = "";
	}

	public Person(String first, String last) {
		setName(first,last);
	
	}
	
	//Method to output the first name and last name
	public String toString() {
		return firstName +" "+ lastName ;
	}
	public void setName(String first,String last) {
		firstName = first;
		lastName = last;
		
	}
	//to return
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
}
import java.time.*;

public class FictionBook implements Authorr, Bookk{
private String author_name;
private String email;
private String title;
private int publicYear;

public FictionBook(String title, int publicYear) {
	this.title = title;
	this.publicYear = publicYear;	
}

public void setAuthorName(String name) {
	author_name = name;
}
public void setEmail(String email) {
	this.email = email;
}
public boolean checkFormatName() {
	String chkname = getFirstName()+" "+getLastName();
	return author_name.equalsIgnoreCase(chkname)?true:false;
	
}
public boolean chekcEmail() {
	return (email.endsWith("@hotmail.com")||email.endsWith("@windowslive.com"))?
			true:false;
}


public String getLastName() {
	String[] name = new String[3];
	if (author_name.trim().contains(" "))
		{
		name = author_name.split(" ");
		}
	
	return name[1].toUpperCase();
		
}
public String getFirstName() {
	String[] name = new String[3];
	if (author_name.trim().contains(" "))
		{
		name = author_name.split(" ");
		}
	
	return name[0].toUpperCase();
		
}

public String getTitle() {
	return title;
}
public int totalPublicYear() {

	return LocalDate.now().getYear() - publicYear;
}
public String toString() {
	return title + "write by" + getLastName().charAt(0)+"."+getFirstName()
	+ "(" + email + ")" + "\nPublished for " + totalPublicYear() + "years.";
}


}


public class Barista {
	private String name;
	private char gender;
	
	public Barista(String name, char gender) {
		this.name = name;
		this.gender = gender;
	}
	public Barista() {
		this.name = "";
		this.gender = ' ';
	}
	public String getName() {
		return name;
	}
	public String getGenderName() {
		return (gender+"").equalsIgnoreCase("m")?"Male":
			(gender+"").equalsIgnoreCase("f")?"Female":" ";
	}
}

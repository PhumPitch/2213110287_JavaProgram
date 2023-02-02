
public class Theater extends Movie {
	
 private int theaterNo;
 
 public Theater(String id, String name, Director director, int theaterNo) {
	 super(id, name, director);
	 this.theaterNo = theaterNo;
	 
 }
 public Theater() {
	 super();
	 this.theaterNo = 0;
 }
 public String getTheaterName(){
	 return (theaterNo > 14)?"Premium Theater" :(theaterNo > 11)?"Sweet Theater":
		 (theaterNo >= 1)?"Basic Theater": " " ;
 }
 @Override
 public String toString() {
	 return getTheaterName() +":"+ super.toString();
 }
}

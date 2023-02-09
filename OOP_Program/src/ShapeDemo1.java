import java.util.*;
public class ShapeDemo1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Radius : ");
		double radius = scan.nextDouble();
		System.out.print("Enter Height : ");
		double height = scan.nextDouble();
		
		Circle circle = new Circle(radius,null);
		
		System.out.println("\nCircle[radius=" + circle.getRadius()+"]"
				+"\nCircle[radius=" + circle.getArea()+"]\n");
		
		Cylinder cylinder = new Cylinder(radius, height);
		
		System.out.println("Cylinder[height=" + cylinder.getHeight()+",radius="+cylinder.getRadius()+"]"
					+"\nCylinder[area="+cylinder.getArea()+"]"
					+"\nCylinder[volume="+cylinder.getVolume()+"]");
		
	}

}

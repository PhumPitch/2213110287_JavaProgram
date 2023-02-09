import java.util.*;

public class ShapeDemo2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Cylinder[] cylinder = new Cylinder[5];
		for (int i = 0; i < cylinder.length; i++) {
			System.out.print("Enter Radius and Height " + (i+1) + ": ");
			double radius = scan.nextDouble();
			double height = scan.nextDouble();
			cylinder[i] = new Cylinder(radius, height);

		}
		System.out.println();
		int i = 1;
		for (Cylinder _cylinder : cylinder) {
			System.out.println("Cylinder " + i + ", volume=" + _cylinder.getVolume()); i++;
		}
	}
}


public class TestPointD {

	public static void main(String[] args) {
		Point2D p1 = new Point2D();
		System.out.println("Default x, y of Point2D = " +p1);
		p1.setXY(10,11);
		System.out.println("x, y of Point2D = " +p1);
		//regetxy
		
		System.out.println("x Point2D = " + p1.getXY()[0]);
		System.out.println("y Point2D = " + p1.getXY()[1]+"\n");
		
		Point3D p2 = new Point3D();
		System.out.println("Default x, y of Point3D = " +p2);
		p2.setXYZ(10 , 12, 7);
		System.out.println("x Point2D = " + p2.getXYZ()[0]);
		System.out.println("y Point2D = " + p2.getXYZ()[1]);
		System.out.println("z Point2D = " + p2.getXYZ()[2]);
		
	}

}

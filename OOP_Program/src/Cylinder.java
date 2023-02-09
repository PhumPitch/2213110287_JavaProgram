
public class Cylinder extends Circle {
	private double height;
	
	public Cylinder(double radius, double height) {
		super(radius,null);
		this.height = height;
	}
	public double getHeight() {
		return height;
	}

	public double getVolume() {
		return super.getArea()*height;
	}

	public double getArea() {
		return 2*Math.PI*height*super.getRadius() + (2*super.getArea());
	}
	@Override
	public String toString() {
		return "height = "+height+","+super.toString();
	}
}

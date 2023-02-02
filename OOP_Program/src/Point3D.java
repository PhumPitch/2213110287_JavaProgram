
public class Point3D extends Point2D {
	
	private float z;
	
	//def con
	
	public Point3D() {
		super(); //call instance variable from superclass //x = y = 0
		this.z = 0;
		
	}
	public Point3D(float x, float y) {
		super(x,y);
		this.z = z;
		
	}
	
	public float getZ() {
		return z;
	}
	
	public void setZ(float z) {
		this.z = z;
	}
	
	public void setXYZ(float x, float y , float z)  {
		super.setX(x);
		super.setY(y);
		this.z = z;
	}
	
	public float[] getXYZ() {
		float[] results = new float[3];
		results[0] = super.getX();
		results[1] = super.getY();
		results[2] = this.z;
		return results;
	}
	
	@Override
	public String toString() {
		return super.toString()+", and "+getZ();
	}

}

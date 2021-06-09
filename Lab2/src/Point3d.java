/**
* ���������� ����� �����.
**/
public class Point3d extends Point2d{
	/** ���������� Z **/
	private double zCoord;
	/** ����������� ������������� **/
	public Point3d(double x, double y, double z) {
		super(x, y);
		zCoord = z;
	}
	/** ����������� �� ���������. **/
	public Point3d () {
	//�������� ����������� � ����� ����������� � ���������� ��������.
	this(0.0, 0.0, 0.0);
	}
	
	/** ����������� ���������� Z **/
	public double getZ () {
	return zCoord;
	}
	
	/** ��������� �������� ���������� Z. **/
	public void setZ (double val) {
	zCoord = val;
	}
	public boolean equals(Point3d point1) {
		if(this.getX() == point1.getX() && this.getY() == point1.getY() && zCoord == point1.getZ())
			return true;
		else
			return false;
	}
	
	public double distanceTo(Point3d point1) {
		return Math.sqrt(Math.pow(this.getX() - point1.getX(), 2) + Math.pow(this.getY() - point1.getY(), 2) + Math.pow(zCoord - point1.getZ(), 2));
	}
}
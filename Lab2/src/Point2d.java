/**
* ��������� ����� �����.
**/
public class Point2d{
	/** ���������� X **/
	private double xCoord;
	/** ���������� Y **/
	private double yCoord;
	/** ����������� ������������� **/
	public Point2d(double x, double y) {
		xCoord = x;
		yCoord = y;
	}
	/** ����������� �� ���������. **/
	public Point2d () {
	//�������� ����������� � ����� ����������� � ���������� ��������.
	this(0, 0);
	}
	/** ����������� ���������� X **/
	public double getX () {
	return xCoord;
	}
	/** ����������� ���������� Y **/
	public double getY () {
	return yCoord;
	}
	/** ��������� �������� ���������� X. **/
	public void setX (double val) {
	xCoord = val; 
	}
	/** ��������� �������� ���������� Y. **/
	public void setY (double val) {
	yCoord = val;
	}
	public boolean equals(Point2d point1) {
		if(xCoord == point1.getX() && yCoord == point1.getY())
			return true;
		else
			return false;
	}
	public double distanceTo(Point2d point1) {
		return Math.sqrt(Math.pow(xCoord - point1.getX(), 2) + Math.pow(yCoord - point1.getY(), 2));
	}
}
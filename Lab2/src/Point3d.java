/**
* трехмерный класс точки.
**/
public class Point3d extends Point2d{
	/** координата Z **/
	private double zCoord;
	/** Конструктор инициализации **/
	public Point3d(double x, double y, double z) {
		super(x, y);
		zCoord = z;
	}
	/** Конструктор по умолчанию. **/
	public Point3d () {
	//Вызовите конструктор с двумя параметрами и определите источник.
	this(0.0, 0.0, 0.0);
	}
	
	/** Возвращение координаты Z **/
	public double getZ () {
	return zCoord;
	}
	
	/** Установка значения координаты Z. **/
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
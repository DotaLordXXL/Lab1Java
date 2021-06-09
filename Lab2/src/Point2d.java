/**
* двумерный класс точки.
**/
public class Point2d{
	/** координата X **/
	private double xCoord;
	/** координата Y **/
	private double yCoord;
	/** Конструктор инициализации **/
	public Point2d(double x, double y) {
		xCoord = x;
		yCoord = y;
	}
	/** Конструктор по умолчанию. **/
	public Point2d () {
	//Вызовите конструктор с двумя параметрами и определите источник.
	this(0, 0);
	}
	/** Возвращение координаты X **/
	public double getX () {
	return xCoord;
	}
	/** Возвращение координаты Y **/
	public double getY () {
	return yCoord;
	}
	/** Установка значения координаты X. **/
	public void setX (double val) {
	xCoord = val; 
	}
	/** Установка значения координаты Y. **/
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
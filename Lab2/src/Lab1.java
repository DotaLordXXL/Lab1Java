public class Lab1{
	public static void main(String[] args) {
		Point3d point1 = new Point3d();
		Point3d point2 = new Point3d(1.488, 2.28, 3.22);
		Point3d point3 = new Point3d(-1, -2, -3);
		Point3d point4 = new Point3d();
		if(point1.equals(point2) || point1.equals(point3) || point2.equals(point3))
			System.out.println("\nSome of the points are same, try again");
		else
			System.out.format("%.2f", computeArea(point1, point2, point3));
		if(point1.equals(point2) || point1.equals(point4) || point2.equals(point4))
			System.out.println("\nSome of the points are same, try again");
		else
			System.out.format("%.2f", computeArea(point1, point2, point4));
	}
	public static double computeArea(Point3d p1, Point3d p2, Point3d p3) {
		double a = p1.distanceTo(p2);
		double b = p2.distanceTo(p3);
		double c = p3.distanceTo(p1);
		double p = (a + b + c) / 2;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
}
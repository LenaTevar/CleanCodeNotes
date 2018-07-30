package functions;

public class ArgumentObjects {
	/*Check that your arguments don't actually need their own class*/
	
	public void makeCircle(double x, double y, double radius) {};
	
	/*versus*/
	
	public void makeCircle(Point center, double radius) {};
	
	class Point {
		double x;
		double y;
	}

}

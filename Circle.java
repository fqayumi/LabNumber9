import java.lang.Math;

public class Circle {
	private double radius;
	private static int ObjectCount;
	
	public Circle (double r){  //constructor
		radius = r;
		
		ObjectCount++;
	}
		private String formatNumber(double x) {
			Double.toString(x);
			String result = String.format("%.2f", x);
			return result;
		}

		public double getCircumference() {
			double circumference = 2 * radius * Math.PI ;
			return circumference;
		}
		
		public String getFormattedCircumference() {
			double a = (getCircumference());
			return formatNumber(a);
		}
		
		public double getArea() {
			double area = Math.PI * radius * radius;
			return area;
		}
		
		public String getFormattedArea() {
			double a = (getArea());
			return formatNumber(a);
		}
		
		
		
		public int getObjectCount() {
			return ObjectCount;
		}
		
				
}

	
	
		
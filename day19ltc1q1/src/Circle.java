public class Circle extends Shape{
	private int radius;

	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public Circle(int radius) {
		super("Circle");
		this.radius = radius;
		//this.shapeName="Circle";
	}
	public double calculateArea()
	{
		double area = Math.PI*radius*radius;
		return area;
	}
	
}

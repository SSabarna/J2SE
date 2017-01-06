public class Shape {
	protected String shapeName;

	public String getShapeName() {
		return shapeName;
	}

	public void setShapeName(String shapeName) {
		this.shapeName = shapeName;
	}

	public Shape() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Shape(String shapeName) {
		super();
		this.shapeName = shapeName;
	}
	public double calculateArea() {
		return 0;
	}
}

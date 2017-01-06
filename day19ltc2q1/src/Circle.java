
public class Circle extends Shape{
    
    private Integer radius;

	public Integer getRadius() {
		return radius;
	}

	public void setRadius(Integer radius) {
		this.radius = radius;
	}

	public Circle(String name, Integer radius) {
		super(name);
		this.radius = radius;
	}
	public float calculateArea()
	{
		float area=(float) (3.14*radius*radius);
		return area;
	}
	

    
    
    
}

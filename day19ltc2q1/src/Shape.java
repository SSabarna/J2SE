
public abstract class Shape {
    
    protected String name;

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Shape(String name) {
		super();
		this.name = name;
	}

	public abstract float calculateArea();
}

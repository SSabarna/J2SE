
public class Square extends Shape {
private int side;

public int getSide() {
	return side;
}

public void setSide(int side) {
	this.side = side;
}

public Square(int side) {
	super("Square");
	this.side = side;
}

public Square() {
	super();
	// TODO Auto-generated constructor stub
}

public Square(String shapeName) {
	super(shapeName);
	// TODO Auto-generated constructor stub
}
public double calculateArea()
{
	double area = side*side;
	return area;
}



}

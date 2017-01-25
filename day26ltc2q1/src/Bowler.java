
public class Bowler {

	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Bowler(String name) {
		super();
		this.name = name;
	}
	public String toString()
	{
		return String.format(name);
	}
}

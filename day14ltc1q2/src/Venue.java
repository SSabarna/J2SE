
public class Venue {
	String name;
	String city;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public Venue(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
	
	public Venue() {
		
	}
	
	public String toString() {
		return String.format("%s,%s",name,city);
	}
	
}

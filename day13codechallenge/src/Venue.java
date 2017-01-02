
public class Venue {
	String stadiumName;
	String city;
	public Venue() {
		
	}
	
	public Venue(String stadiumName, String city) {
		super();
		this.stadiumName = stadiumName;
		this.city = city;
	}
	public String getStadiumName() {
		return stadiumName;
	}
	public void setStadiumName(String stadiumName) {
		this.stadiumName = stadiumName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
}

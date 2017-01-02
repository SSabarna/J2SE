
public class Player {

	String name;
	String country;
	String skill;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}

	public Player(String name, String country, String skill) {
		super();
		this.name = name;
		this.country = country;
		this.skill = skill;
	}
	
	public Player() {
		
	}
	
	public String toString() {
		return (name+" --- "+country+" --- "+skill);
	}
	
	public boolean equals(Object o)
	{
		boolean r=false;
		if(o==null|| o.getClass()!=getClass())
		{
			r=false;
		}
		else {
			Player ob=(Player)o;
			if(this.name.equals(ob.getName()) && this.country.equals(ob.getCountry()) && this.skill.equals(ob.getSkill())){
				r=true;
			}
		}
		return r;
	}

}

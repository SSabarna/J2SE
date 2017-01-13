
public class Player {
	private
	String name;
	String skill;
	public Player(String name, String skill) {
		super();
		this.name = name;
		this.skill = skill;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	
	public boolean equals(Player p) {
		if(this.name.equals(p.getName()))
			return true;
		return false;
	}
	@Override
	public int hashCode() {
		return this.getName().hashCode();
	}
	

}

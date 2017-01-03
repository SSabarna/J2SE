
public class Skill {
	String skillName;

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}
	public Skill(String skillName)
	{
		this.skillName = skillName;
	}
	public Skill()
	{
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%-15s",skillName);
	}
}

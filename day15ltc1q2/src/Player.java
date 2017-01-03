public class Player {
		String name;
		String country;
		Skill skill;
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
		public Skill getSkill() {
			return skill;
		}
		public void setSkill(Skill skill) {
			this.skill = skill;
		}
		public Player(String name,String country,Skill skill)
		{
			this.name = name;
			this.country = country;
			this.skill = skill;
		}
		public Player()
		{
			
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return String.format("%-15s %-15s %-15s",name,country,skill);
		}
	}

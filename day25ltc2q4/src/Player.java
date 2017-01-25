public class Player implements Comparable<Player> {
	String playerName;
	String skill;
	Long capNumber;
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public Long getCapNumber() {
		return capNumber;
	}
	public void setCapNumber(Long capNumber) {
		this.capNumber = capNumber;
	}
	public Player(String playerName, String skill, Long capNumber) {
		super();
		this.playerName = playerName;
		this.skill = skill;
		this.capNumber = capNumber;
	}
	@Override
	public int compareTo(Player o) {
		
		return this.capNumber.compareTo(o.getCapNumber());
	}
        @Override
        public String toString() {	// TODO Auto-generated method stub
        	return(playerName+"-"+capNumber);
        }
}
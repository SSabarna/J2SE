
public class Player implements Comparable<Player>{
	private 
	Integer capNumber;
	String playerName;
	String skill;
	String country;
	Integer matchesPlayed;
	public Player(Integer capNumber, String playerName, String skill,
			String country, Integer matchesPlayed) {
		super();
		this.capNumber = capNumber;
		this.playerName = playerName;
		this.skill = skill;
		this.country = country;
		this.matchesPlayed = matchesPlayed;
	}
	public Integer getCapNumber() {
		return capNumber;
	}
	public void setCapNumber(Integer capNumber) {
		this.capNumber = capNumber;
	}
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
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Integer getMatchesPlayed() {
		return matchesPlayed;
	}
	public void setMatchesPlayed(Integer matchesPlayed) {
		this.matchesPlayed = matchesPlayed;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format(capNumber+","+playerName+","+skill+","+country+","+matchesPlayed+"\n");
	}
	@Override
	public int compareTo(Player p) {
		// TODO Auto-generated method stub
		return this.getCapNumber().compareTo(p.getCapNumber());
	}
	

}

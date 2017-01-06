
public abstract class Player implements IPlayerStatistics{
	
	protected String name, teamName, noOfMatches;

	public Player(String name, String teamName, String noOfMatches) {
		super();
		this.name = name;
		this.teamName = teamName;
		this.noOfMatches = noOfMatches;
	}
	

}

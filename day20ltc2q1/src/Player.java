
public class Player implements IPlayerStatistics{

	private String name; 
	private String teamName; 
	private Integer noOfMatches; 
	private long totalRunsScored;
	private int noOfWicketsTaken;
	public Player(String name, String teamName, Integer noOfMatches,
			long totalRunsScored, int noOfWicketsTaken) {
		super();
		this.name = name;
		this.teamName = teamName;
		this.noOfMatches = noOfMatches;
		this.totalRunsScored = totalRunsScored;
		this.noOfWicketsTaken = noOfWicketsTaken;
	} 
	
	public void displayPlayerStatistics()
	{
		System.out.println("Player Details");
		System.out.println("Player name : "+name);
		System.out.println("Team name : "+teamName);
		System.out.println("No of matches : "+noOfMatches);
		System.out.println("Total runsscored : "+totalRunsScored);
		System.out.println("No of wickets taken : "+noOfWicketsTaken);
		
	}
}

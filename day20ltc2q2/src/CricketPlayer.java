
public class CricketPlayer extends Player{
	
	 private String totalRunsScored,noOfWicketsTaken;
	 
	public CricketPlayer(String name, String teamName, String noOfMatches,
			String totalRunsScored, String noOfWicketsTaken) {
		super(name, teamName, noOfMatches);
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

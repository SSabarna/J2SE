
public class Bowler extends CricketPlayer implements IPlayerStatistics{
	
	private String noOfWickets;

	public Bowler(String name, String teamName, String noOfMatches,
			String noOfWickets) {
		super(name, teamName, noOfMatches);
		this.noOfWickets = noOfWickets;
	}

	@Override
	public void displayPlayerStatistics() {
		// TODO Auto-generated method stub
		System.out.println("Player name : "+name);
		System.out.println("Team name : "+teamName);
		System.out.println("No of matches : "+noOfMatches);
		System.out.println("No of wickets taken : "+noOfWickets);
	}
	

}

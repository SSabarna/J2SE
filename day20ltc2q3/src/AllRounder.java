
public class AllRounder extends CricketPlayer implements IPlayerStatistics{

	private String  runs,noOfWickets;

	public AllRounder(String name, String teamName, String noOfMatches,
			String runs, String noOfWickets) {
		super(name, teamName, noOfMatches);
		this.runs = runs;
		this.noOfWickets = noOfWickets;
	}

	@Override
	public void displayPlayerStatistics() {
		// TODO Auto-generated method stub
		System.out.println("Player name : "+name);
		System.out.println("Team name : "+teamName);
		System.out.println("No of matches : "+noOfMatches);
		System.out.println("Runs scored : "+runs);
		System.out.println("No of wickets taken : "+noOfWickets);
	}
	
}


public class Batsman extends CricketPlayer implements IPlayerStatistics{

	private String runs;

	public Batsman(String name, String teamName, String noOfMatches, String runs) {
		super(name, teamName, noOfMatches);
		this.runs = runs;
	}

	@Override
	public void displayPlayerStatistics() {
		// TODO Auto-generated method stub
		System.out.println("Player name : "+name);
		System.out.println("Team name : "+teamName);
		System.out.println("No of matches : "+noOfMatches);
		System.out.println("Runs scored : "+runs);
	}
	
}

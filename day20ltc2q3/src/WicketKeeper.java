
public class WicketKeeper extends CricketPlayer implements IPlayerStatistics{
	
	private String noOfCatches,noOfStumpings,runs,noOfDismissals;

	public WicketKeeper(String name, String teamName, String noOfMatches,
			String noOfCatches, String noOfStumpings,String noOfDismissals, String runs
			) {
		super(name, teamName, noOfMatches);
		this.noOfCatches = noOfCatches;
		this.noOfStumpings = noOfStumpings;
		this.runs = runs;
		this.noOfDismissals = noOfDismissals;
	}

	@Override
	public void displayPlayerStatistics() {
		// TODO Auto-generated method stub
		System.out.println("Player name : "+name);
		System.out.println("Team name : "+teamName);
		System.out.println("No of matches : "+noOfMatches);
		System.out.println("No of catches taken : "+noOfCatches);
		System.out.println("No of stumpings : "+noOfStumpings);
		System.out.println("No of dismissals : "+noOfDismissals);
		System.out.println("Runs scored : "+runs);
	}
	
}


public class HockeyPlayer extends Player{
	private String position, noOfGoals ;

	public HockeyPlayer(String name, String teamName, String noOfMatches,
			String position, String noOfGoals) {
		super(name, teamName, noOfMatches);
		this.position = position;
		this.noOfGoals = noOfGoals;
	}
	
	public void displayPlayerStatistics()
	{
		System.out.println("Player Details");
		System.out.println("Player name : "+name);
		System.out.println("Team name : "+teamName);
		System.out.println("No of matches : "+noOfMatches);
		System.out.println("Position : "+position);
		System.out.println("No of goals taken : "+noOfGoals);
	}
}

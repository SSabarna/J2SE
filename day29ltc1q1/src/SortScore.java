import java.util.Arrays;


public class SortScore extends Thread{
	String matchType;
	String scoreString;
	int scores[];
	
	public SortScore(String matchType, String scoreString) {
		super();
		this.matchType = matchType;
		this.scoreString = scoreString;
	}

	public String getMatchType() {
		return matchType;
	}

	public void setMatchType(String matchType) {
		this.matchType = matchType;
	}

	public String getScoreString() {
		return scoreString;
	}

	public void setScoreString(String scoreString) {
		this.scoreString = scoreString;
	}

	public void setScores(int[] scores) {
		this.scores = scores;
	}
	@Override
	public void run()
	{
		this.scoreString=scoreString;
	}
	
	public void getScores()
	{
		String s[] = scoreString.split(",");
		int scores[] = new int[s.length];
		for(int i=0;i<s.length;i++)
		{
			scores[i]= Integer.parseInt(s[i]);
		}
		Arrays.sort(scores);
		setScores(scores);
		System.out.println("Match : "+matchType);
		for(int i=0;i<scores.length;i++)
		{
			System.out.println(scores[i]);
		}
	}
}
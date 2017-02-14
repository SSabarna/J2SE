import java.util.Arrays;


public class CalculateScores implements Runnable{
	private String matchType;
	private String scoreString;
	Integer[] scores;
	Double meanScore;
	Integer minScore=0;
	Integer maxScore=0;
	public CalculateScores(String matchType, String scoreString) {
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
	public void run()
	{
		
		String[] ss=scoreString.split(",");
		int len=ss.length;
		
		 scores=new Integer[len];
		 for(int i=0;i<len;i++)
			scores[i]=Integer.parseInt(ss[i]);
		 maxScore=scores[0];
		 for(int i=0;i<len;i++)
		 {
			 if(maxScore<scores[i])
			 {
				 maxScore=scores[i];
			 }
				 
		 }
		 minScore=scores[0];
		 for(int i=0;i<len;i++)
		 {
			 if(minScore>scores[i])
			 {
				 minScore=scores[i];
			 }
				 
		 }
		 Integer sum=0;
		 for(int i=0;i<len;i++)
		 {
			sum=sum+scores[i];
				 
		 }
		 meanScore=(double)sum/len;
	}
	public Integer[]  getScores()
	{
		Arrays.sort(scores);
		return scores;
	}
}

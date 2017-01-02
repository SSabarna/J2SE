
public class Innings {
	String battingTeam;
	long runs;
	public Innings(String battingTeam, long runs) {
		super();
		this.battingTeam = battingTeam;
		this.runs = runs;
	}
	public Innings() {
		
	}
	public String getBattingTeam() {
		return battingTeam;
	}
	public void setBattingTeam(String battingTeam) {
		this.battingTeam = battingTeam;
	}
	public long getRuns() {
		return runs;
	}
	public void setRuns(long runs) {
		this.runs = runs;
	}
	
}

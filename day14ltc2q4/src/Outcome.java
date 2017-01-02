
public class Outcome {
	private String status ;
	private String winnerTeam ;
	private String playerOfMatch ;
	private String date;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getWinnerTeam() {
		return winnerTeam;
	}
	public void setWinnerTeam(String winnerTeam) {
		this.winnerTeam = winnerTeam;
	}
	public String getPlayerOfMatch() {
		return playerOfMatch;
	}
	public void setPlayerOfMatch(String playerOfMatch) {
		this.playerOfMatch = playerOfMatch;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Outcome(String date, String status, String winnerTeam,
			String playerOfMatch) {
		super();
		this.status = status;
		this.winnerTeam = winnerTeam;
		this.playerOfMatch = playerOfMatch;
		this.date = date;
	}
	public Outcome() {
		
	}
	public String toString()
	 {
	  return String.format("%-20s %-20s %-20s %s",status,winnerTeam,playerOfMatch,date);
	 }

}

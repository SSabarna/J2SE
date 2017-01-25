import java.io.*;
public class File {
	
	
	    
	private String name;
	private String teamName;
	private int numberOfMatches;
	public File(String name, String teamName, int numberOfMatches) {
		super();
		this.name = name;
		this.teamName = teamName;
		this.numberOfMatches = numberOfMatches;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public int getNumberOfMatches() {
		return numberOfMatches;
	}
	public void setNumberOfMatches(int numberOfMatches) {
		this.numberOfMatches = numberOfMatches;
	}


	

}

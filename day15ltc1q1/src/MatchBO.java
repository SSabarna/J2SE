import java.util.*;


public class MatchBO {
	public void printAllMatchDetails(Match[] MatchList) {
	 	

		System.out.println("Match Details");
		String n[]={"Date","Team1","Team2","Venue","Status","Winner"};
		System.out.printf("%-15s %-15s %-15s %-15s %-15s %s",n);
		System.out.println();
		for(int i=0;i<MatchList.length;i++)
		{
			System.out.println(MatchList[i].toString());
		}
	    
	}
	 	
	public void printMatchDetailsWithOutcomeStatus(Match[] MatchList, String outcomeStatus) {
		System.out.println("Match Details");
		String n[]={"Date","Team1","Team2","Venue","Status","Winner"};
		System.out.printf("%-15s %-15s %-15s %-15s %-15s %s",n);
		System.out.println();
		for(int i=0;i<MatchList.length;i++)
		{
			if(MatchList[i].getOutcome().getStatus().equals(outcomeStatus))
			System.out.println(MatchList[i].toString());
		}
	}
	 	
	public void printMatchDetailsWithOutcomeWinnerTeam(Match[] MatchList, String outcomeWinnerTeam) {
		System.out.println("Match Details");
		String n[]={"Date","Team1","Team2","Venue","Status","Winner"};
		System.out.printf("%-15s %-15s %-15s %-15s %-15s %s",n);
		System.out.println();
		for(int i=0;i<MatchList.length;i++)
		{
			if(MatchList[i].getOutcome().getWinnerTeam().endsWith(outcomeWinnerTeam))
			System.out.println(MatchList[i].toString());
		}
	 		
	}
}

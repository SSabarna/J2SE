public class MatchBO {
	void displayAllMatchDetails(Match[] matchList)
	{
		System.out.println("Match Details");
		String n[]={"Team 1","Team 2","Date","Venue"};
		System.out.printf("%-35s %-30s %-15s %s",n);
		System.out.println();
		for(int i=0;i<matchList.length;i++)
		{
			System.out.println(matchList[i].toString());
		}
		
	}
	void displaySpecificMatchDetails(Match[] matchList, String date)
	{
		System.out.println("Match Details");
		String n[]={"Team 1","Team 2","Date","Venue"};
		System.out.printf("%-35s %-30s %-15s %s",n);
		System.out.println();
		for(int i=0;i<matchList.length;i++)
		{
			if(matchList[i].toString().contains(date))
			System.out.println(matchList[i].toString());
		}
	}
}
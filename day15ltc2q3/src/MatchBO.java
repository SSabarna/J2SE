
public class MatchBO {
	    public Match createMatch(String data, Venue[] venueList) {		
	             //fill your code
	    	String g[]=data.split(",");
	    	int i;
	    	for(i=0;i<venueList.length;i++)
	    	{
	    		if(g[3].equals(venueList[i].getName()))
	    			break;
	    	}
	    	Match m=new Match(g[0],g[1],g[2],venueList[i]);
	    	return m;
	    }
	    public void findVenue(String date, Match[] matchList) {
			
	             int i;
	             for(i=0;i<matchList.length;i++)
	             {
	            	 if(date.equals(matchList[i].getDate()))
	            		 break;
	             }
	             
	             System.out.println("Match was held at "+matchList[i].getVenue().getName());
		}
		
		
	    
	    public void findAllMatchesInGivenVenue(String sname, Match[] matchList) {
		       //fill your code
	    	System.out.println("Matches in venue "+sname+" are");
			String ml[]={"Date","TeamOne","TeamTwo"};
			System.out.printf("%-15s%-15s%s",ml);
			System.out.println();
	    	int i;
			for(i=0;i<matchList.length;i++)
			{
				if(sname.equals(matchList[i].getVenue().getName()))
					
			System.out.println(matchList[i].toString());
			}
		}
}

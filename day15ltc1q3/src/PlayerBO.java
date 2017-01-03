
public class PlayerBO {
	 public Player createPlayer(String data, Team[] teamList)
		{
			String h[]=data.split(",");
			int i;
			for( i=0;i<teamList.length;i++)
			{
				if(h[1].equals(teamList[i].getName()))
				break;
			}
			Player p=new Player(h[0],teamList[i]);
			return p;
		}
		
		public String findTeamName(Player[] playerList, String playername)
		{
			int i;
		for(i=0;i<playerList.length;i++)
		{
			if(playername.equals(playerList[i].getName()))
					break;
		}
		return playerList[i].getTeam().getName();
			
		}
		
		public Boolean findWhetherPlayersAreInSameTeam (Player[] playerList, String playername1, String playername2)
		{
			
				if(findTeamName(playerList,playername1).equals(findTeamName(playerList,playername2)))
				
					 return true;
				
				
				 else
					 return false;
		}

}

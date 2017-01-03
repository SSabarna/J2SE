
class PlayerBO  {
    public Player createPlayer(String data, Team[] teamList) {
      String a[]=data.split(",");
      int i;
      for(i=0;i<teamList.length;i++) {
    	  if(a[1].equals(teamList[i]. getName()))
    		  break;
      }
      Player p=new Player(a[0],teamList[i]);
      return p;
    }
    
    public String findTeamName(Player[] playerList, String sname) {
    	int i;
		for(i=0;i<playerList.length;i++){
			if(playerList[i].getName().equals(sname))
				break;
		}
		return playerList[i].getTeam(). getName();
	}
		
    
    public Boolean findWhetherPlayersAreInSameTeam(Player[] playerList, String sn1, String sn2) {
    	int i;
		String s1="",s2="";
		for(i=0;i<playerList.length;i++){
			if(playerList[i].getName(). equals(sn1)){
				s1=playerList[i].getTeam(). getName();
				break;
			}
		}
			for(i=0;i<playerList.length;i++){
				if(playerList[i].getName(). equals(sn2)){
					s2=playerList[i].getTeam(). getName();
					break;
				}
			}
		if(s1.equals(s2))
            return true;
		else 
			return false;
			 
	}
}

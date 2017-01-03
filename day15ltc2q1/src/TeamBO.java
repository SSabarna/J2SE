
	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	class TeamBO
	{

	  
	 public Team createTeam(String data, Player[] playerList)
	 {
	  
	    //fill your code
		 String g[]=data.split(",");
		 int i;
		 for(i=0;i<playerList.length;i++)
		 {
		 if(g[1].equals(playerList[i].getName()))
			 break;
		 }
		 Team t=new Team(g[0],playerList[i]);
		 return t;
	 }


}

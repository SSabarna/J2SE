import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class MatchBO
{
   
 public Match createMatch(String data, Team[] teamList)
  {
 String g[]=data.split(",");
 int i;
 for(i=0;i<teamList.length;i++)
 {
	 if(g[1].equals(teamList[i].getName()))
		 break;
 }
 Match m=new Match(g[0],g[1],g[2],g[3],teamList[i]);
 return m;
    //fill your code
  }

  public Match findTeam(String matchDate, Match[] matchList)
  {
    //fill your code
	  int i;
   for(i=0;i<matchList.length;i++)
   {
	   if(matchDate.equals(matchList[i].date))
		   break;
   }
   return matchList[i];
  }

  public void findAllMatchesInGivenTeam(String teamName, Match[] matchList)
  {
    //fill your code
  int i;
  for(i=0;i<matchList.length;i++)
  {
	  if(matchList[i].toString().contains(teamName))
		  System.out.println(matchList[i].toString());
  }
  }
}
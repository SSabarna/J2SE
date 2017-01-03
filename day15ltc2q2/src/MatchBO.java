import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class MatchBO
{
 
 public Match createMatch(String data, Umpire[] umpireList)
  {
   //fill your code
	 String g[]=data.split(",");
	 int i;
	 for(i=0;i<umpireList.length;i++)
	 {
		 if(g[3].equals(umpireList[i].getName()))
			 break;
	 }
	 Match m=new Match(g[0],g[1],g[2],umpireList[i]);
	 return m;
  }

  public Match findUmpire(String matchDate, Match[] matchList)
  {
   //fill your code
	  int i;
	  for(i=0;i<matchList.length;i++)
	  {
		  if(matchList[i].toString().contains(matchDate))
			  break;
	  }
	  return matchList[i];
  }
 
  public void findAllMatchesOfGivenUmpire(String umpireName, Match[] matchList)
  {
   //fill your code
	  int i;
	  for(i=0;i<matchList.length;i++)
	  {
		  if(umpireName.equals(matchList[i].getUmpire().getName()))
			  System.out.println(matchList[i].toString());
			  
	  }
	  
  }
}

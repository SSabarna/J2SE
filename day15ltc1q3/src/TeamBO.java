
public class TeamBO {
	public  Team createTeam(String data)
	{
    	String g[]=data.split(",");
    	Team t=new Team(g[0],g[1]);
    	return t;
	}
	
}

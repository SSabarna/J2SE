
public class TeamBO {
	public Team createTeam(String data) {
	       String a[]=data.split(",");
	       Team t= new Team(a[0],a[1]);
	       return t;
	   }
}

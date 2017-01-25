import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Please provide the number of players to be registered");
		int n = Integer.parseInt(s.nextLine());
		int i;
		List l = new ArrayList();
		Player p[] = new Player[n];
		for(i=0;i<n;i++)
		{
			System.out.println("Please enter player name");
			String a = s.nextLine();
			System.out.println("Please select the skill of the player");
			System.out.println("1.All Rounder");
			System.out.println("2.Batsman");
			System.out.println("3.Bowler");
			String ch = s.nextLine();
			String b = "";
			if(ch.equals("1"))
				b="All Rounder";
			else if(ch.equals("2"))
				b="Batsman";
			else if(ch.equals("3"))
				b="Bowler";
			l.add(p[i] = new Player(a,b));
		}
		Collections.sort(l,new PlayerComparator());
		Iterator it = l.iterator();
		System.out.println("Player Details");
		while(it.hasNext())
		{
			Player p2 = (Player)it.next();
			System.out.println(p2);
		}
	}

}

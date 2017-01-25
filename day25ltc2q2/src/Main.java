import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;


public class Main {

	public static void main(String[] args) throws ParseException {
		Scanner sc=new Scanner(System.in);
		TreeSet<Match> ts=new TreeSet<Match>();
		String team1,team2;
		String data;
		 DateFormat df = new SimpleDateFormat("MM-dd-yyyy");
		try{
			
		System.out.println("Enter the number of matches");
		int n=Integer.parseInt(sc.nextLine());
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter match date in (MM-dd-yyyy)");
			 data=sc.nextLine();
			
			Date date = df.parse(data);
			System.out.println("Enter Team 1");
			team1=sc.nextLine();
			System.out.println("Enter Team 2");
			team2=sc.nextLine();
			ts.add(new Match(date,team1,team2));
		}
		System.out.println("Match Details");
		Iterator itr=ts.descendingIterator();
		while(itr.hasNext())
		{
			Match m=(Match) itr.next();
			System.out.println("Team 1 "+m.getTeamOne());
			System.out.println("Team 2 "+m.getTeamTwo());
			System.out.println("Match held on "+df.format(m.getMatchDate()));
		}
	}
	catch(Exception e){}
	}
	
}
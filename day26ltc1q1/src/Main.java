import java.util.*;
public class Main {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number of teams:");
	int n=Integer.parseInt(sc.nextLine());
	ArrayList<Team> l=new ArrayList<Team>();
	for(int i=0;i<n;i++)
	{
		System.out.println("Enter team "+(i+1)+" detail");
		System.out.println("Enter Name");
		String name=sc.nextLine();
		System.out.println("Enter number of matches");
		long nom=Long.parseLong(sc.nextLine());
		Team t=new Team(name,nom);
		l.add(t);
		
	}
	Collections.sort(l,new TeamComparator());
	System.out.println("Team list after sort by number of matches");
	Iterator<Team> t = l.iterator();
	while(t.hasNext())
	{
		Team t2=t.next();
	System.out.println(t2);	
	}
	
}
}
import java.util.Scanner;
public class Main {
public static void main(String args[])
{
	int n;
	String d,t1,t2,v;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of matches");
	n=sc.nextInt();
	sc.nextLine();
	Match[] w=new Match[n];
	for(int i=1;i<=n;i++)
	{
		System.out.println("Enter match "+i+" details");
		System.out.println("Enter the match date");
		d=sc.nextLine();
		System.out.println("Enter the team one");
		t1=sc.nextLine();
		System.out.println("Enter the team two");
		t2=sc.nextLine();
		System.out.println("Enter the Venue");
		v=sc.nextLine();
		w[i-1]=new Match(d,t1,t2,v);
	}
	
	MatchBO l=new MatchBO();
	l.displayAllMatchDetails(w);
	System.out.println("Enter the date to be searched");
	String m=sc.nextLine();
	
	l.displaySpecificMatchDetails(w,m);

}
}
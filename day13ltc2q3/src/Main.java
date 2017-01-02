import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of innings");
		int x=sc.nextInt();
		Innings ob[] = new Innings[x];
		for(int i=0;i<x;i++)
		{
			sc.nextLine();
			System.out.println("Enter the values for Innings "+(i+1));
			System.out.println("Enter the BattingTeam");
			String bt = sc.nextLine();
			System.out.println("Enter the runs scored");
			long r = sc.nextLong();
			ob[i] = new Innings();
			ob[i].setBattingTeam(bt);
			ob[i].setRuns(r);
		}
		System.out.println("Innings Details");
		for(int i=0;i<x;i++)
		{
			System.out.println("Innings "+(i+1));
			System.out.println(ob[i].toString());
		}
		
	}

}

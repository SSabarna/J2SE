import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Menu");
		System.out.println("1.Crciket Player Details");
		System.out.println("2.Hockey Player Details");
		System.out.println("Enter choice");
		int n = Integer.parseInt(s.nextLine());
		switch(n)
		{
		case 1:
		{
			System.out.println("Enter player name");
			String a = s.nextLine();
			System.out.println("Enter team name");
			String b = s.nextLine();
			System.out.println("Enter number of matches played");
			String c = s.nextLine();
			System.out.println("Enter total runs scored");
			String d = s.nextLine();
			System.out.println("Enter total number of wickets taken");
			String e = s.nextLine();
			Player p = new CricketPlayer(a,b,c,d,e);
			p.displayPlayerStatistics();
			break;
		}
		case 2:
		{
			System.out.println("Enter player name");
			String a = s.nextLine();
			System.out.println("Enter team name");
			String b = s.nextLine();
			System.out.println("Enter number of matches played");
			String c = s.nextLine();
			System.out.println("Enter the position");
			String d = s.nextLine();
			System.out.println("Enter total number of goals taken");
			String e = s.nextLine();
			Player p = new HockeyPlayer(a,b,c,d,e);
			p.displayPlayerStatistics();
			break;
		}
		default:
		{
			System.out.println("Invalid Input");
			break;
		}
		}
	}

}

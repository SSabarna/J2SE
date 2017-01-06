import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String st = "YES";
		while(st.equals("YES"))
		{
		System.out.println("Menu");
		System.out.println("1.Bowler");
		System.out.println("2.Batsman");
		System.out.println("3.WicketKeeper");
		System.out.println("4.AllRounder");
		System.out.println("Enter your choice");
		int n = Integer.parseInt(s.nextLine());
		switch(n)
		{
		case 1:
		{
			System.out.println("Enter the Bowler details");
			System.out.println("Enter player name");
			String a = s.nextLine();
			System.out.println("Enter team name");
			String b = s.nextLine();
			System.out.println("Enter number of matches played");
			String c = s.nextLine();
			System.out.println("Enter number of wickets taken");
			String d = s.nextLine();
			Bowler p = new Bowler(a,b,c,d);
			p.displayPlayerStatistics();
			System.out.println("Do you want to continue?");
			st = s.nextLine();
			break;
			
		}
		case 2:
		{
			System.out.println("Enter the Batsman details");
			System.out.println("Enter player name");
			String a = s.nextLine();
			System.out.println("Enter team name");
			String b = s.nextLine();
			System.out.println("Enter number of matches played");
			String c = s.nextLine();
			System.out.println("Enter the runs scored");
			String d = s.nextLine();
			Batsman p = new Batsman(a,b,c,d);
			p.displayPlayerStatistics();
			System.out.println("Do you want to continue?");
			st = s.nextLine();
			break;
		}
		case 3:
		{
			System.out.println("Enter the WicketKeeper details");
			System.out.println("Enter player name");
			String a = s.nextLine();
			System.out.println("Enter team name");
			String b = s.nextLine();
			System.out.println("Enter number of matches played");
			String c = s.nextLine();
			System.out.println("Enter number of catches taken");
			String d = s.nextLine();
			System.out.println("Enter number of stumpings");
			String e = s.nextLine();
			System.out.println("Enter number of dismissals");
			String f = s.nextLine();
			System.out.println("Enter the runs scored");
			String g = s.nextLine();
			WicketKeeper p = new WicketKeeper(a,b,c,d,e,f,g);
			p.displayPlayerStatistics();
			System.out.println("Do you want to continue?");
			st = s.nextLine();
			break;
		}
		case 4:
		{
			System.out.println("Enter the AllRounder details");
			System.out.println("Enter player name");
			String a = s.nextLine();
			System.out.println("Enter team name");
			String b = s.nextLine();
			System.out.println("Enter number of matches played");
			String c = s.nextLine();
			System.out.println("Enter the runs scored");
			String d = s.nextLine();
			System.out.println("Enter number of wickets taken ");
			String e = s.nextLine();
			AllRounder p = new AllRounder(a,b,c,d,e);
			p.displayPlayerStatistics();
			System.out.println("Do you want to continue?");
			st = s.nextLine();
			break;
		}
		default:
		{
			System.out.println("Please Enter a Valid Input");
			break;
		}
		}
		}
	}

}

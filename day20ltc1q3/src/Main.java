import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter player name");
		String p = sc.nextLine();
		System.out.println("Enter team name");
		String t = sc.nextLine();
		System.out.println("Enter number of matches");
		Long nm = Long.parseLong(sc.nextLine());
		System.out.println("Menu");
		System.out.println("1.Bowler details");
		System.out.println("2.Batsman details");
		System.out.println("Enter choice");
		int ch = Integer.parseInt(sc.nextLine());
		switch(ch)
		{
		case 1:
			System.out.println("Enter number of wicktes taken");
			long w = Long.parseLong(sc.nextLine());
			Bowler pl = new Bowler(p,t,nm,w);
			pl.displayDetails();
			break;
		case 2:
			System.out.println("Enter number of runs scored");
			long r = Long.parseLong(sc.nextLine());
			Batsman pl1 = new Batsman(p,t,nm,r);
			pl1.displayDetails();
			break;
		}

	}

}

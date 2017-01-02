import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("Enter the over");
		long o = sc.nextLong();
		sc.nextLine();
		System.out.println("Enter the ball");
		long b = sc.nextLong();
		sc.nextLine();
		System.out.println("Enter the wicket type");
		String wt = sc.nextLine();
		System.out.println("Enter the player name"); 
		String pn = sc.nextLine();
		System.out.println("Enter the bowler name");
		String bn = sc.nextLine();
		Wicket w = new Wicket();
		w.setOver(o);
		w.setBall(b);
		w.setWicketType(wt);
		w.setPlayerName(pn);
		w.setBowlerName(bn);
		System.out.println("Wicket Details");
		System.out.println("Over : "+w.getOver());
		System.out.println("Ball : "+w.getBall());
		System.out.println("Wicket Type : "+w.getWicketType());
		System.out.println("Player Name : "+w.getPlayerName()); 
		System.out.println("Bowler Name : "+w.getBowlerName());
	}

}

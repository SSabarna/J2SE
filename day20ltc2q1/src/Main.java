import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
				Scanner s = new Scanner(System.in);
				System.out.println("Enter player name");
				String a = s.nextLine();
				System.out.println("Enter team name");
				String b = s.nextLine();
				System.out.println("Enter number of matches played");
				int c = Integer.parseInt(s.nextLine());
				System.out.println("Enter total runs scored");
				int d = Integer.parseInt(s.nextLine());
				System.out.println("Enter number of wickets taken");
				int e = Integer.parseInt(s.nextLine());
				Player p = new Player(a,b,c,d,e);
				p.displayPlayerStatistics();
			}
			
		}
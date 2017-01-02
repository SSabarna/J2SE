import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Innings obj[] = new Innings[3];
		System.out.println("Enter the values for Innings "+1);
		System.out.println("Enter the BattingTeam");
		String bt = sc.nextLine();
		System.out.println("Enter the runs scored");
		long r = sc.nextLong();
		sc.nextLine();
		Innings A = new Innings(bt,r);
		System.out.println("Enter the values for Innings "+2);
		System.out.println("Enter the BattingTeam");
		String bt1 = sc.nextLine();
		System.out.println("Enter the runs scored");
		long r1 = sc.nextLong();
		Innings B = new Innings(bt1,r1);
		System.out.println("Innings 1 Details");
		System.out.println("BattingTeam : "+A.getBattingTeam());
		System.out.println("Runs scored : "+A.getRuns());
		System.out.println("Innings 2 Details");
		System.out.println("BattingTeam : "+B.getBattingTeam());
		System.out.println("Runs scored : "+B.getRuns());

	}

}

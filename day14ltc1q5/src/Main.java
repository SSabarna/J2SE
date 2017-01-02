import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Innings [] innings = new Innings[2];
		InningsBO inningsBO = new InningsBO();
		System.out.println("Enter the values for FirstInnings");
		System.out.println("Enter the BattingTeam");
		String battingTeam1 = sc.nextLine();
		System.out.println("Enter the runs scored");
		long runs1 = Long.parseLong(sc.nextLine());
		innings[0] = new Innings(battingTeam1,runs1);
		System.out.println("Enter the values for SecondInnings");
		System.out.println("Enter the BattingTeam");
		String battingTeam2 = sc.nextLine();
		System.out.println("Enter the runs scored");
		long runs2 = Long.parseLong(sc.nextLine());
		innings[1]=new Innings(battingTeam2,runs2);
		inningsBO.displayAllInningsDetails(innings);
		
	}

}

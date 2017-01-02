import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the team name");
		String n = sc.nextLine();
		System.out.println("Enter the coach name");
		String co = sc.nextLine();
		System.out.println("Enter the location name");
		String l = sc.nextLine();
		System.out.println("Enter the players name");
		String p = sc.nextLine();
		System.out.println("Enter the captain name");
		String ca = sc.nextLine();
		Team obj = new Team();
		obj.name = n;
		obj.coach = co;
		obj.location = l;
		obj.players = p;
		obj.captain = ca;
		obj.displayTeamDetails();
	}

}

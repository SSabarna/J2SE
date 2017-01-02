import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the team details");
		String td = sc.nextLine();
		String parts[] = td.split("#");
		String part1 = parts[0];
		String part2 = parts[1];
		String part3 = parts[2];
		String part4 = parts[3];
		String part5 = parts[4];
		Team obj = new Team(part1,part2,part3,part4,part5);
		System.out.println("Team : "+obj.getName());
		System.out.println("Coach : "+obj.getCoach());
		System.out.println("Location : "+obj.getLocation());
		System.out.println("Players : "+obj.getPlayers());
		System.out.println("Captain : "+obj.getCaptain());

	}

}

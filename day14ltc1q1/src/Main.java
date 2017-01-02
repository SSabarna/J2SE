import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the player name");
		String n = sc.nextLine();
		System.out.println("Enter the country name");
		String c = sc.nextLine();
		System.out.println("Enter the skill");
		String s = sc.nextLine();
		Player player = new Player(n,c,s);
		PlayerBO ob = new PlayerBO();
		ob.displayPlayerDetails(player);

	}

}

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the player name");
		String s1 = sc.nextLine();
		System.out.println("Enter the team name");
		String s2 = sc.nextLine();
		UserMainCode u = new UserMainCode();
		u.display(s1,s2);

	}

}

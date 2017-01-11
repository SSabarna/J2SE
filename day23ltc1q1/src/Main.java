import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the player name");
		String a = s.nextLine();
		System.out.println("Enter the team name");
		String b = s.nextLine();
		UserMainCode u = new UserMainCode();
		u.display(a,b);
		
	}

}

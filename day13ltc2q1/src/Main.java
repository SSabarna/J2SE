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
		Player ob = new Player(n,c,s);
		//ob.setName(n);
		//ob.setCountry(c);
		//ob.setSkill(s);
		System.out.println("Player Details");
		System.out.println(ob.toString( ));

	}

}

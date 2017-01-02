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
		Player ob = new Player();
		ob.name = n;
		ob.country = c;
		ob.skill = s;
		System.out.println("Player Details :");
		System.out.println("Player Name : "+ob.name);
		System.out.println("Country Name : "+ob.country);
		System.out.println("Skill : "+ob.skill);
		
	}

}

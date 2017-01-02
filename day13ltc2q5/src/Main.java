import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the player 1 details");
		System.out.println("Enter the player name");
		String n1 = sc.nextLine();
		System.out.println("Enter the country name");
		String c1 = sc.nextLine();
		System.out.println("Enter the skill");
		String s1 = sc.nextLine();
		Player ob1 = new Player(n1,c1,s1);
		System.out.println(ob1.toString());
		System.out.println("Enter the player 2 details");
		System.out.println("Enter the player name");
		String n2 = sc.nextLine();
		System.out.println("Enter the country name");
		String c2 = sc.nextLine();
		System.out.println("Enter the skill");
		String s2 = sc.nextLine();
		Player ob2 = new Player(n2,c2,s2);
		System.out.println(ob2.toString());
		if(ob1.equals(ob2))
			System.out.println("Both the player details are same.");
		else
			System.out.println("Both the player details are not same.");
		
	}

}

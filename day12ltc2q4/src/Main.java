import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("Enter the player name");
		String n = sc.nextLine();
		System.out.println("Enter the country name");
		String c = sc.nextLine();
		System.out.println("Enter the skill");
		String s = sc.nextLine();
		Player obj = new Player();
		obj.setName(n);
		obj.setCountry(c);
		obj.setSkill(s);
		System.out.println("Player Details");
		System.out.println("Player Name :"+obj.getName());
		System.out.println("Country Name :"+obj.getCountry());
		System.out.println("Skill :"+obj.getSkill());
		System.out.println("Verify and Update Player Details");
		while(true)
		{
			System.out.println("Menu");
			System.out.println("1.Update Player Name");
			System.out.println("2.Update Country Name");
			System.out.println("3.Update Skill");
			System.out.println("4.All informations Correct/Exit");
			System.out.println("Type 1 or 2 or 3 or 4");
			String ch = sc.nextLine();
			switch(ch)
			{
			case "1": System.out.println("The current player name is "+obj.getName());
					  System.out.println("Enter the player name");
					  n=sc.nextLine();
					  obj.setName(n);
			break;
			case "2": System.out.println("The current country name is "+obj.getCountry());
					  System.out.println("Enter the country name");
					  c=sc.nextLine();
					  obj.setCountry(c);
					break;
			case "3": System.out.println("The current skill is "+obj.getSkill());
					  System.out.println("Enter the skill");
					  s=sc.nextLine();
					  obj.setSkill(s);
					  break;
			case "4": System.out.println("Player Details");
					  System.out.println("Player Name :"+obj.getName());
					  System.out.println("Country Name :"+obj.getCountry());
					  System.out.println("Skill :"+obj.getSkill());
					  System.exit(0);
			}
		}
	}
}
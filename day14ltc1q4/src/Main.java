import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("Enter the number of players");
		int n = sc.nextInt();
		sc.nextLine();
		Player player[]=new Player[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the player name");
			String name=sc.nextLine();
			System.out.println("Enter the country name");
			String country=sc.nextLine();
			System.out.println("Enter the skill");
			String skill=sc.nextLine();
			player[i]=new Player(name,country,skill);
		}
		PlayerBO ob=new PlayerBO();
		ob.displayAllPlayerDetails(player);

	}

}

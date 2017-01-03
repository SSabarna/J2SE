import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of players");
		int n = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the player name");
		String str[] = new String[n];
		for(i=0;i<n;i++)
		{
			str[i] = sc.nextLine();
		}
		System.out.println("Player name starting with 'M' or Ending with 'a'");
		for(i=0;i<n;i++)
		{
			if(str[i].startsWith("M")==true||str[i].endsWith("a"))
				System.out.println(str[i]);
		}

	}

}

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of players");
		int n = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter player names");
		String str[] = new String[n];
		for(i=0;i<n;i++)
		{
			str[i] = sc.nextLine();
		}
		for(i=0;i<n;i++)
		{
			if(str[i].contains("Sharma")==true)
				System.out.println(str[i]);
		}

	}

}

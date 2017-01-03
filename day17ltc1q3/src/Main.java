import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of players");
		int n = sc.nextInt();
		sc.nextLine();
		String str[] = new String[n];
		for(i=0;i<n;i++)
		{
			str[i] = sc.nextLine();
		}
		for(i=0;i<n;i++)
		{
			if((str[i].lastIndexOf('a'))==(str[i].indexOf('a')))
				System.out.println("Player of the Match:\n"+str[i]);
		}

	}

}

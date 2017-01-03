import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter team1");
		String str1 = sc.nextLine();
		System.out.println("Enter team2");
		String str2 = sc.nextLine();
		System.out.println("Enter third character");
		char ch = sc.next().charAt(0);
		if(ch==str1.charAt(2))
			System.out.println("Winner Team : "+str1);
		else
			System.out.println("Winner Team : "+str2);

	}

}

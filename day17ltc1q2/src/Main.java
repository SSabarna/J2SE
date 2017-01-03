import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter team1");
		String str1 = sc.nextLine();
		System.out.println("Enter team2");
		String str2 = sc.nextLine();
		if(str1.equalsIgnoreCase(str2)==true)
			System.out.println("Both the venues are same.");
		else
			System.out.println("Both the venues are different.");

	}

}

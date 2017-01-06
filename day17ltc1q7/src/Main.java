import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter player names");
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		if(str1.regionMatches(0,str2,0,6)==true)
			System.out.println("Both the players names starts with Michael");
		else
			System.out.println("Both the players names does not starts with Michael");

	}

}

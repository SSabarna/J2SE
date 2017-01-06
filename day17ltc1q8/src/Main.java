import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter team details");
		String str = sc.nextLine();
		System.out.println("After replacement");
		System.out.println(str.replaceAll("Captain", "Skipper"));

	}

}

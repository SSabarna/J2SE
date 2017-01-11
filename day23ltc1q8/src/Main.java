import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the player details");
		String a = s.nextLine();
		UserMainCode u = new UserMainCode();
		u.display(a);
	}

}

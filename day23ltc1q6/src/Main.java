import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the team names");
		String s = sc.nextLine();
		UserMainCode u = new UserMainCode();
		u.display(s);

	}

}

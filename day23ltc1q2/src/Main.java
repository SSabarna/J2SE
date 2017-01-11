import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the venue name");
		String a = s.nextLine();
		UserMainCode u = new UserMainCode();
		u.display(a);
	}

}
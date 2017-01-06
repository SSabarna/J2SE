import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		UserMainCode u = new UserMainCode();
		if(u.validateOver(s))
			System.out.println("Valid");
		else
			System.out.println("Invalid");

	}

}

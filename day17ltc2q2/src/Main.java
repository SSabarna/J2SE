import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String d = s.nextLine();
		UserMainCode u = new UserMainCode();
		if(u.validateTeam(d)==true)
			System.out.println("Valid");
		else
			System.out.println("Invalid");
	}

}

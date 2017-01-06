import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String n = s.nextLine();
		String c = s.nextLine();
		String format = s.nextLine();
		UserMainCode u = new UserMainCode();
		if(u.validatePlayer(n,c,format)==true)
			System.out.println("Valid");
		else
			System.out.println("Invalid");
		
		

	}

}

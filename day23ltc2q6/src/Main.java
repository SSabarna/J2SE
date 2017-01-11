import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  s= new Scanner(System.in);
		String a = s.nextLine();
		UserMainCode u = new UserMainCode();
		if(u.validateTeam(a))
		System.out.println("Valid");
		else
			System.out.println("Invalid");
	}

}

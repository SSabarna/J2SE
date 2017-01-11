import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner  s= new Scanner(System.in);
		String a = s.nextLine();
		UserMainCode u = new UserMainCode();
		if(u.validateTeam(a))
			System.out.println("Lucky");
		else
			System.out.println("Unlucky");
	}

}

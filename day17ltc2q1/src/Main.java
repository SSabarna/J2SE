import java.text.*;
import java.util.*;


public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String d = s.nextLine();
		UserMainCode u = new UserMainCode();
		if(u.validateDate(d))
			System.out.println("Valid");
		else
			System.out.println("Invalid");
	}

}
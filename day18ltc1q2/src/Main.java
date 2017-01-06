import java.text.ParseException;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String in this format(YYYY-MM-DD HH:mm:ss)");
		String d = sc.nextLine();
		UserMainCode u = new UserMainCode();
		u.displayDateTime(d);

		
	}

}

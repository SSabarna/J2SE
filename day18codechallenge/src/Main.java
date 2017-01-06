import java.text.ParseException;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		UserMainCode u = new UserMainCode();
		u.displayDate(s);

	}

}

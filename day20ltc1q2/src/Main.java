import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Menu");
		System.out.println("1.Match Date");
		System.out.println("2.Match Venue");
		System.out.println("3.Match Outcome");
		int ch = Integer.parseInt(sc.nextLine());
		Match m = new Match();
		switch(ch)
		{
		case 1:
			System.out.println("Enter the date of the match");
			String date = sc.nextLine();
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			Date dt1 = sdf.parse(date);
			m.displayMatchDetails(dt1);
			break;
		case 2:
			System.out.println("Enter venue of the match");
			String s = sc.nextLine();
			m.displayMatchDetails(s);
			break;
		case 3: 
			System.out.println("Enter the winner team of the match");
			String s1 = sc.nextLine();
			System.out.println("Enter the number of runs");
			long r = Long.parseLong(sc.nextLine());
			m.displayMatchDetails(s1,r);
			break;
		}
	}
}
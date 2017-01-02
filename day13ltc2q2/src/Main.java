import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the match date");
		String d = sc.nextLine();
		System.out.println("Enter the team one");
		String t1 = sc.nextLine();
		System.out.println("Enter the team two");
		String t2 = sc.nextLine();
		System.out.println("Enter the Venue");
		String v = sc.nextLine();
		Match ob = new Match(d,t1,t2,v);
		/*ob.setName(n);
		ob.setCountry(c);
		ob.setSkill(s);*/
		System.out.println("Match Details");
		System.out.println(ob.toString( ));

	}

}

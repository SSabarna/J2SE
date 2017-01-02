import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the venue name");
		String v = sc.nextLine();
		System.out.println("Enter the city name");
		String c = sc.nextLine();
		Venue ob = new Venue(v,c);
		/*ob.setName(n);
		ob.setCountry(c);
		ob.setSkill(s);*/
		System.out.println("Venue Details");
		System.out.println(ob.toString( ));
	}

}

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the venue name");
		String n = sc.nextLine();
		System.out.println("Enter the city name");
		String c = sc.nextLine();
		Venue ob = new Venue();
		ob.name = n;
		ob.city = c;
		System.out.println("Venue Details :");
		System.out.println("Venue Name : "+ob.name);
		System.out.println("City Name : "+ob.city);
	}

}

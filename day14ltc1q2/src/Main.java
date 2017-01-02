import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the venue name");
		String vn = sc.nextLine();
		System.out.println("Enter the city name");
		String cn = sc.nextLine();
		Venue venue = new Venue(vn,cn);
		VenueBO ob = new VenueBO();
		ob.displayVenueDetails(venue);

	}

}

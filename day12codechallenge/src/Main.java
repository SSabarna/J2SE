import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the innings");
		//long i = sc.nextLong();
		long i = Long.parseLong(sc.nextLine());
		System.out.println("Enter the event");
		long e = Long.parseLong(sc.nextLine());
		System.out.println("Enter the raider");
		String r = sc.nextLine();
		System.out.println("Enter the defenders");
		String d = sc.nextLine();
		System.out.println("Enter the raiderPoints");
		long rp = Long.parseLong(sc.nextLine());
	
		System.out.println("Enter the defenderPoints");
		//long dp = sc.nextLong();
		long dp = Long.parseLong(sc.nextLine());
		Event ob = new Event();
		ob.setInnings(i);
		ob.setEventNumber(e);
		ob.setRaider(r);
		ob.setDefenders(d);
		ob.setRaiderPoints(rp);
		ob.setDefenderPoints(dp);
		System.out.println("Event Details");
		System.out.println("Innings :"+ob.getInnings());
		System.out.println("Event :"+ob.getEventNumber());
		System.out.println("Raider :"+ob.getRaider());
		System.out.println("Defenders :"+ob.getDefenders());
		System.out.println("Raider Points :"+ob.getRaiderPoints());
		System.out.println("Defender Points :"+ob.getDefenderPoints());
	}

}

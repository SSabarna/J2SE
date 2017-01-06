import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		HotelRoom h;
		System.out.println("Hotel Tariff Calculator");
		System.out.println("1. Deluxe Room");
		System.out.println("2. Deluxe AC Room");
		System.out.println("3. Suite AC Room");
		System.out.println("Select Room Type:");
		int n = s.nextInt();
		s.nextLine();
		switch(n)
			{
			case 1:
			{
				System.out.println("Hotel Name:");
				String a = s.nextLine();
				System.out.println("Room Square Feet Area:");
				int b = Integer.parseInt(s.nextLine());
				System.out.println("Room has TV (yes/no):");
				String st = s.nextLine();
				boolean c;
				if(st.equals("yes"))
					c = true;
				else
					c = false;
				System.out.println("Room has Wifi (yes/no):");
				String st1 = s.nextLine();
				boolean d;
				if(st1.equals("yes"))
					d = true;
				else
					d = false;
				h = new DeluxeRoom(a,b,c,d);
				//int g = h.getRatePerSqFeet();
				System.out.println("Room Tariff per day is:"+h.calculateTariff());
				
				break;
			}
			case 2:
			{
				System.out.println("Hotel Name:");
				String a = s.nextLine();
				System.out.println("Room Square Feet Area:");
				int b = Integer.parseInt(s.nextLine());
				System.out.println("Room has TV (yes/no):");
				String st = s.nextLine();
				boolean c;
				if(st.equals("yes"))
					c = true;
				else
					c = false;
				System.out.println("Room has Wifi (yes/no):");
				String st1 = s.nextLine();
				boolean d;
				if(st1.equals("yes"))
					d = true;
				else
					d = false;
				h = new DeluxeACRoom(a,b,c,d);
				int g = h.getRatePerSqFeet();
				System.out.println("Room Tariff per day is:"+h.calculateTariff());
				break;
			}
			case 3:
			{
				System.out.println("Hotel Name:");
				String a = s.nextLine();
				System.out.println("Room Square Feet Area:");
				int b = Integer.parseInt(s.nextLine());
				System.out.println("Room has TV (yes/no):");
				String st = s.nextLine();
				boolean c;
				if(st.equals("yes"))
					c = true;
				else
					c = false;
				System.out.println("Room has Wifi (yes/no):");
				String st1 = s.nextLine();
				boolean d;
				if(st1.equals("yes"))
					d = true;
				else
					d = false;
				h = new SuiteACRoom(a,b,c,d);
				int g = h.getRatePerSqFeet();
				System.out.println("Room Tariff per day is:"+h.calculateTariff());
				
				break;
				
			}
			}
	}

	}

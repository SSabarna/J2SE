import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the venue name");
		String n=sc.nextLine();
		System.out.println("Enter the city name");
		String c=sc.nextLine();
		Venue obj=new Venue();
		obj.setName(n);
		obj.setCity(c);
		System.out.println("Venue Details");
		System.out.println("Venue Name : "+obj.getName());
		System.out.println("City Name : "+obj.getCity());
		while(true)
		{
			System.out.println("Verify and Update Venue Details");
			System.out.println("Menu");
			System.out.println("1.Update Venue Name");
			System.out.println("2.Update City Name");
			System.out.println("3.All informations Correct/Exit");
			System.out.println("Type 1 or 2 or 3");
			String k=sc.nextLine();
			switch(k)
			{
			case "1": System.out.println("Enter the venue name");
					  n=sc.nextLine();
					  obj.setName(n);
					  System.out.println("Venue Details");
					  System.out.println("Venue Name : "+obj.getName());
					  System.out.println("City Name : "+obj.getCity());
					  break;
			case "2": System.out.println("Enter the city name");
					  c=sc.nextLine();
					  obj.setCity(c);
					  System.out.println("Venue Details");
					  System.out.println("Venue Name : "+obj.getName());
					  System.out.println("City Name : "+obj.getCity());
					  break;
			case "3": System.out.println("Venue Details");
					  System.out.println("Venue Name : "+obj.getName());
					  System.out.println("City Name : "+obj.getCity());
					  System.exit(0);
			}
		}
	}
}
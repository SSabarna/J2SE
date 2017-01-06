import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Menu");
		System.out.println("1.Player details of the delivery");
		System.out.println("2.Run details of the delivery");
		int ch = Integer.parseInt(sc.nextLine());
		Delivery d = new Delivery();
		switch(ch)
		{
		case 1: 
			
			System.out.println("Enter the bowler name");
			String bo = sc.nextLine();
			System.out.println("Enter the batsman name");
			String ba = sc.nextLine();
			d.displayDeliveryDetails(bo,ba);
			break;
		case 2:
			System.out.println("Enter the number of runs");
			long r = sc.nextLong();
			d.displayDeliveryDetails(r);

	}

}
}

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		System.out.println();
		System.out.println("Enter the number of deliveries");
		int d = sc.nextInt();
		Delivery deliveryList[] = new Delivery[d];
		for(i=0;i<d;i++)
		{
			System.out.println("Enter the over");
			long o = sc.nextLong();
			System.out.println("Enter the ball");
			long b = sc.nextLong();
			sc.nextLine();
			System.out.println("Enter the batsman");
			String ba = sc.nextLine();
			System.out.println("Enter the bowler");
			String bo = sc.nextLine();
			System.out.println("Enter the nonStriker");
			String ns = sc.nextLine();
			deliveryList[i]=new Delivery(o,b,ba,bo,ns);
		}
		DeliveryBO ob=new DeliveryBO();
		ob.displayAllDeliveryDetails(deliveryList);
		
	}

}

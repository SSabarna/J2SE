import java.util.Scanner;


public class Main {

	public static void main(String[] args) {       
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of deliveries");
		int n = Integer.parseInt(sc.nextLine());
		Delivery[] delivery=new Delivery[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the over");
			long over=Long.parseLong(sc.nextLine());
		    System.out.println("Enter the ball");
		    long ball=Long.parseLong(sc.nextLine());
		    System.out.println("Enter the runs");
		    long runs=Long.parseLong(sc.nextLine());
		    System.out.println("Enter the batsman name");
		    String batsman=sc.nextLine();
		    System.out.println("Enter the bowler name");
		    String bowler=sc.nextLine();
		    System.out.println("Enter the nonStriker name");
		    String nonStriker=sc.nextLine();
		    delivery[i] = new Delivery(over,ball,runs,batsman,bowler,nonStriker);      
		}
		System.out.println("Enter your choice\n1.View delivery details\n2.Batsman and Bowler\n3.Maximum runs");
		int ch=Integer.parseInt(sc.nextLine());
		DeliveryBO dBo=new DeliveryBO();
		switch(ch)
		{
			case 1:
			dBo.displayAllDeliveryDetails(delivery);
			break;
			case 2:
			System.out.println("Enter the over for which batsman and bowler to be known");
			long oversearch=Long.parseLong(sc.nextLine());
			System.out.println("Enter the ball for which batsman and bowler to be known");
			long ballsearch=Long.parseLong(sc.nextLine());
			dBo.displayBatsmanBowlerDetails(delivery,ballsearch,oversearch); 
			break; 
			case 3:
			dBo.displayMaximumRunDetails(delivery);  
			break;
		}

	}

}

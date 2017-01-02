import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long o,b,r;
		String bat,bow,ns;
		System.out.println("Enter the over");
		o=sc.nextLong();
		sc.nextLine();
		System.out.println("Enter the ball");
		b=sc.nextLong();
		sc.nextLine();
		System.out.println("Enter the runs");
		r=sc.nextLong();
		sc.nextLine();
		System.out.println("Enter the batsman name");
		bat=sc.nextLine();
		System.out.println("Enter the bowler name");
		bow=sc.nextLine();
		System.out.println("Enter the nonStriker name");
		ns=sc.nextLine();
		Delivery ob=new Delivery();
		ob.over=o;
		ob.ball=b;
		ob.runs=r;
		ob.batsman=bat;
		ob.bowler=bow;
		ob.nonStriker=ns;
		ob.displayDeliveryDetails();

	}

}

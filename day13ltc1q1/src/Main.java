import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the over");
		int o = sc.nextInt();
		System.out.println("Enter the ball");
		int b = sc.nextInt();
		System.out.println("Enter the runs");
		int r = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the batsman name");
		String bname = sc.nextLine();
		System.out.println("Enter the bowler name");
		String boname = sc.nextLine();
		System.out.println("Enter the nonStriker name");
		String nsname = sc.nextLine();
		Delivery dr = new Delivery(o,b,r,bname,boname,nsname);
		//dr.setOver(o);
		//dr.setBall(b);
		//dr.setRuns(r);
		//dr.setBatsman(bname);
		//dr.setBowler(boname);
		//dr.setNonStriker(nsname);
		System.out.println("Over : "+dr.getOver());
		System.out.println("Ball : "+dr.getBall());
		System.out.println("Runs : "+dr.getRuns());
		System.out.println("Batsman : "+dr.getBatsman());
		System.out.println("Bowler : "+dr.getBowler());
		System.out.println("NonStriker : "+dr.getNonStriker());
	}

}

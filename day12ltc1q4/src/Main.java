import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		long r;
		String o,b;
		System.out.println("Enter the innings number");
		o=sc.nextLine();
		System.out.println("Enter the BattingTeam");
		b=sc.nextLine();
		System.out.println("Enter the runs scored");
		r=sc.nextLong();
		Innings obj=new Innings();
		obj.number=o;
		obj.battingTeam=b;
		obj.runs=r;
		obj.displayInningsDetails();
	}

}

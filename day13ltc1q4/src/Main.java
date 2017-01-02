import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of wickets");
		int n =sc.nextInt();
		sc.nextLine();
		Wicket ob[] = new Wicket[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the details of wicket "+(i+1));
			String st = sc.nextLine();
			String ss[] = st.split(",");
			long l1 = Long.parseLong(ss[0]);
			long l2 = Long.parseLong(ss[1]);
			ob[i] = new Wicket(l1,l2,ss[2],ss[3],ss[4]);
			ob[i].setOver(l1);
			ob[i].setBall(l2);
			ob[i].setWicketType(ss[2]);
			ob[i].setPlayerName(ss[3]);
			ob[i].setBowlerName(ss[4]);
		}
		System.out.print("Wicket Details");
		for(int i=0;i<n;i++)
		{
			System.out.printf("\nOver : %s\nBall : %s\nWicket Type : %s\nPlayer Name : %s\nBowler Name : %s",ob[i].getOver(),ob[i].getBall(),ob[i].getWicketType(),ob[i].getPlayerName(),ob[i].getBowlerName());
		}
	}

}

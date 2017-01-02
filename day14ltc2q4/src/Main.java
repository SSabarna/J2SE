import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of matches");
        int n = Integer.parseInt(sc.nextLine());
        //sc.nextLine();
        Outcome[] outcome=new Outcome[n];
        for(int i=0;i<n;i++)
        {
        	System.out.println("Enter match "+(i+1)+" details");
        	System.out.println("Enter the date");
        	String date = sc.nextLine();
        	System.out.println("Enter the status");
        	String status = sc.nextLine();
        	System.out.println("Enter the winner team");
        	String winnerTeam = sc.nextLine();
        	System.out.println("Enter the player of match");
        	String playerOfMatch = sc.nextLine();
        	outcome[i]=new Outcome(date,status,winnerTeam,playerOfMatch);
        }
        OutcomeBO oBo=new OutcomeBO();
        oBo.displayAllOutcomeDetails(outcome);
        System.out.println("Enter the date to be searhed");
        String sd=sc.nextLine();
        oBo.displaySpecificOutcomeDetails(outcome,sd);

	}

}

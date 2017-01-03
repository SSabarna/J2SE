import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of matches");
		int n =sc.nextInt();
		sc.nextLine();
		Match match[]=new Match[n];
		Outcome outcome[]=new Outcome[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter match "+(i+1)+" details:");
			
			System.out.println("Enter match date");
		    String date = sc.nextLine();
			
			System.out.println("Enter team one");
			String teamOne = sc.nextLine();
			
			System.out.println("Enter team two");
			String teamTwo = sc.nextLine();
			
			System.out.println("Enter venue");
			String venue = sc.nextLine();
			
			System.out.println("Enter status");
			String status = sc.nextLine();
			
			System.out.println("Enter winner Team");
			String winnerTeam = sc.nextLine();
			
			outcome[i] = new Outcome(status,winnerTeam);	
			match[i] = new Match(date,teamOne,teamTwo,venue,outcome[i]);
			
		}

		MatchBO matchBO=new MatchBO();
		
		while(true)
		{
			System.out.println("Menu");
			System.out.println("1.View match details");
			System.out.println("2.Filter match details with outcome status");
			System.out.println("3.Filter match details with outcome winner team");
			System.out.println("4.Exit");
			
			System.out.println("Enter your choice");
			String choice = sc.nextLine();
			
			switch(choice)
			{
			case "1":
				matchBO.printAllMatchDetails(match);
				break;
				
			case "2":
				System.out.println("Enter outcome status");
				 String status = sc.nextLine();
				 matchBO.printMatchDetailsWithOutcomeStatus(match,status);
				 break;
			case "3":
				System.out.println("Enter outcome winner team");
				String winnerTeam = sc.nextLine();
				matchBO.printMatchDetailsWithOutcomeWinnerTeam(match,winnerTeam);
				break;
			default:
					System.exit(0);
							
			}
			
		}

	}

}

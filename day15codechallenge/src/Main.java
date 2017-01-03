
		import java.util.*;
		public class Main {
				public static void main(String args[]) {
					Scanner sc = new Scanner(System.in);
					System.out.println("Enter the team count");
					Integer ccount = sc.nextInt();
					sc.nextLine();
					Team [] teamList = new Team[ccount];
					TeamBO teamBO = new TeamBO();
					Integer i;
					String data;
					for(i=0;i<ccount;i++) {
						System.out.println("Enter team "+(i+1)+" details");
						data = sc.nextLine();
						teamList[i] = teamBO.createTeam(data);
					}
					System.out.println("Enter the player count");
					Integer scount = sc.nextInt();
					sc.nextLine();
					Player [] playerList = new Player[scount];
					PlayerBO playerBO = new PlayerBO();
					for(i=0;i<scount;i++) {
						System.out.println("Enter player "+(i+1)+" details");
						data = sc.nextLine();
						playerList[i] = playerBO.createPlayer(data, teamList);
					}
					System.out.println("Enter the player name for which you need to find the team name");
					String sname = sc.nextLine();
					System.out.println("The player "+ sname +" is in team "+playerBO.findTeamName( playerList, sname));
					
					System.out.println("Enter 2 player names");
					sname = sc.nextLine();
					String sname1 = sc.nextLine();
					if(playerBO. findWhetherPlayersAreInSameTeam(playerList, sname, sname1))
						System.out.println("The 2 players are in the same team");
					else
						System.out.println("The 2 players are in different teams");
					
	}

}


	import java.io.*;
	public class Main {
		public static void main(String[] args) throws IOException
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the number of players");
			int n=Integer.parseInt(br.readLine());
			Player [] player=new Player[n];
			for(int i=0;i<n;i++)
			{
				System.out.println("Enter the player name");
				String name=br.readLine();
				System.out.println("Enter the country name");
				String country=br.readLine();
				System.out.println("Enter the skill");
				String skill=br.readLine();
				player[i]=new Player(name,country,skill);
			}
			PlayerBO playerBO=new PlayerBO();
			playerBO.displayAllPlayerDetails(player);
			System.out.println("Enter the country name for which players details to be known");
			String countryName=br.readLine();
			playerBO.displaySpecificPlayerDetails(player,countryName);
		        
	}

}

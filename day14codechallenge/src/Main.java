
	import java.io.*;
		 class Main {

		    public static void main(String[] args) throws IOException {
		       
		        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		        String name;
		        String country;
		        String skill;
		        Integer n;
		        System.out.println("Enter the number of players");
		        n=Integer.parseInt(br.readLine());
		        Player [] player=new Player[n];
		        for(int i=0;i<n;i++)
		        {
		        	System.out.println("Enter player "+(i+1)+" details");
		        	System.out.println("Enter the player name");
		        	name=br.readLine();
		        	System.out.println("Enter the country name");
		        	country=br.readLine();
		        	System.out.println("Enter the skill");
		        	skill=br.readLine();
		        	player[i]=new Player(name,country,skill);
		        }
		        PlayerBO playerBO=new PlayerBO();
		System.out.println("Menu\n1.View all player details\n2.Search Player");
		int ch=Integer.parseInt(br.readLine());
		switch(ch)
		{
		        case 1: {/*{System.out.println("Player Details");
		        String str[] = {"Name","Country","Skill"};
		        System.out.printf("%-15s%-15s%s\n",str);*/
		        		playerBO.displayAllPlayerDetails(player);
		        		break;}
		        case 2:
		        		{System.out.println("Enter the country name for which players details to be known");
		        		String countryName=br.readLine();
		        		 
		        		playerBO.displaySpecificPlayerDetails(player,countryName);
		        		break;}
		}

	}

}

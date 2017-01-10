import java.util.*;
public class Main {

	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the team name");
		String a = s.nextLine();
		System.out.println("Enter the number of players suggested");
		int n = Integer.parseInt(s.nextLine());
		int i;
		int playerId[] = new int[n];
		String playerName[] = new String[n];
		for(i=0;i<n;i++)
		{
			System.out.println("Enter player "+(i+1)+" details");
			playerId[i] = Integer.parseInt(s.nextLine());
			playerName[i] = s.nextLine();
		}
		try {
		for(i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				
					if(playerId[i]==playerId[j])
						throw new DuplicateIdException("Player Id must be unique");
				
			}
		}
		for(i=0;i<n;i++)
		{
			System.out.println(playerId[i]+" "+playerName[i]);
		}
		} catch (Exception e) {
			System.out.println(e.getClass().getCanonicalName()+": "+e.getMessage());
		}
		
	}

}

import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String x = null,y = null,z = null;
		System.out.println("Enter the number of players");
		int n = Integer.parseInt(s.nextLine());
		Player p[] = new Player[n];
		try
		{
			
			System.out.println("Do you know the details of the captain? Type Yes / No");
			String st = s.nextLine();
			if(st.equals("Yes"))
			{
				System.out.println("Enter name of the captain");
				x = s.nextLine();
				System.out.println("Enter country of the captain");
				y = s.nextLine();
				System.out.println("Enter skillset of the captain");
				z = s.nextLine();
			}
			int i;
			
			for(i=0;i<n;i++)
			{
				System.out.println("Enter name of player "+(i+1));
				String a = s.nextLine();
				System.out.println("Enter country of player "+(i+1));
				String b = s.nextLine();
				System.out.println("Enter skillset of player "+(i+1));
				String c = s.nextLine();
				p[i] = new Player(a,b,c);
			}
			if(st.equals("Yes"))
			{
				
			System.out.println(x+", "+y+", "+z);
			}
			else
			{
				
				throw new NullPointerException();
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception Occured : "+e.getClass().getCanonicalName());
			System.out.println("Captain details not available");
		}
		finally
		{
			System.out.println("Player Details");
			PlayerBO pb = new PlayerBO();
			for(int i=0;i<n;i++)
			{
				pb.displayPlayerDetails(p[i]);
			}
		}
	}

}

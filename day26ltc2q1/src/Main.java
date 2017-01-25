import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Map m = new HashMap();
		String ch="yes";
		int i;
		while(ch.equals("yes"))
		{
		System.out.println("Enter the player name");
		String a = s.nextLine();
		System.out.println("Enter wickets - seperated by \"|\" symbol");
		String b = s.nextLine();
		//String st[] = b.split("\\|");
		//int n = st.length;
		
		m.put(a, b);
		System.out.println("Do you want to add another player (yes/no)");
		ch = s.nextLine();
		}
		String ch2="yes";
		
		while(ch2.equals("yes"))
		{
			System.out.println("Enter the player name to search");
			String d = s.nextLine();
			if(m.containsKey(d))
			{
				System.out.println("Player Name : "+d);
				System.out.println("Wickets :");
				String w = (String) m.get(d);
				String st[] = w.split("\\|");
				for(i=0;i<st.length;i++)
					System.out.println(st[i]);
			}
			else
				System.out.println("No player found with the name "+d);
			System.out.println("Do you want to search another player (yes/no)");
			ch2 = s.nextLine();
		}
	}

}

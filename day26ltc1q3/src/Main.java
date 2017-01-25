import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Map m = new HashMap();
		String ch="yes";
		while(ch.equals("yes"))
		{
		System.out.println("Enter the player name");
		String a = s.nextLine();
		System.out.println("Enter wickets - seperated by \"|\" symbol.");
		String b = s.nextLine();
		String st[] = b.split("\\|");
		int c = st.length;
		m.put(a, c);
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
				System.out.println("Player name : "+d);
			System.out.println("Wicket Count : "+m.get(d));
			}
			else
				System.out.println("No player found with the name "+d);
			System.out.println("Do you want to search another player (yes/no)");
			ch2 = s.nextLine();
		}
	}

}

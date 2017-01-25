import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of players");
		int n = Integer.parseInt(s.nextLine());
		int i;
		Map m = new TreeMap();
		Player p[] = new Player[n];
		List l = new ArrayList();
		for(i=0;i<n;i++)
		{
			System.out.println("Enter the details of the player "+(i+1));
			int a = Integer.parseInt(s.nextLine());
			String b = s.nextLine();
			String c = s.nextLine();
			String d = s.nextLine();
			p[i] = new Player(b,c,d);
			l.add(a);
			m.put(a, p[i]);
		}
		System.out.println("Player Details");
		Collection c = m.values();
		Collections.sort(l);
		Iterator it = l.iterator();
		while(it.hasNext())
		{
			int a1 = (Integer) it.next();
			System.out.println(a1+""+m.get(a1));
		}
	}

}

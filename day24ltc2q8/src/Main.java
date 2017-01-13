import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st="";
		int n = Integer.parseInt(sc.nextLine());
		ArrayList<String> arl1 = new ArrayList<String>();
		ArrayList<String> arl2 = new ArrayList<String>();
		int i;
		for(i=0;i<n;i++)
			arl1.add(sc.nextLine());
		for(i=0;i<n;i++)
		{
			st = arl1.get(i).toString();
			String sb[] = st.split("-");
			if(sb[1].equals("0")&&sb[2].equals("0"))
				arl2.add(sb[0]);
			
		}
		if(arl2.isEmpty())
			System.out.println("No player has scored a duck");
		else
			for(i=0;i<arl2.size();i++)
				System.out.println(arl2.get(i));
		}
	}

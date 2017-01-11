import java.util.StringTokenizer;

public class UserMainCode {

	public static void display(String a)
	{
		StringTokenizer st = new StringTokenizer(a," ");
		StringTokenizer st1 = new StringTokenizer(a," ");
		String str="";
		while(st.hasMoreTokens())
		{
			//str = st.nextToken() + " " + str;
			System.out.println(st.nextToken());
		}
		while(st1.hasMoreTokens())
		{
			str = st1.nextToken() + " " + str;
		}
		System.out.println(str);
		
	}
}

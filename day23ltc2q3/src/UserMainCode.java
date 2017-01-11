import java.util.StringTokenizer;


public class UserMainCode {
	public static void display(String a)
	{
		 int i,j;
		    StringTokenizer st = new StringTokenizer(a, "!#");
		    while(st.hasMoreTokens())
		    	System.out.print(st.nextToken());
	}
}
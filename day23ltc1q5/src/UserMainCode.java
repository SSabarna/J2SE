import java.util.StringTokenizer;


public class UserMainCode {
public static void display(String str) {
	StringTokenizer st = new StringTokenizer(str,",");
	while(st.hasMoreTokens())
		System.out.println(st.nextToken());
	System.out.println();
	
}
}

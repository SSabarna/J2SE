import java.util.StringTokenizer;


public class UserMainCode {
public static void display(String str) {
	StringTokenizer st = new StringTokenizer(str,",");
	System.out.println("Player Name : "+st.nextToken(","));
}
}

import java.util.StringTokenizer;


public class UserMainCode {
public static void display(String str) {
	StringTokenizer st = new StringTokenizer(str,"#");
	int n = st.countTokens();
	System.out.println("Number of teams : "+n);
	
}
}

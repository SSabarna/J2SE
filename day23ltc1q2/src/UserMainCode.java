
public class UserMainCode {

	public static void display(String a)
	{
		int n = a.indexOf("Stadium");
		StringBuffer sb = new StringBuffer(a);
		System.out.println("Modified Venue");
		System.out.println(sb.replace(n, sb.length(), "Ground"));
	}
}

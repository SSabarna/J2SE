
public class UserMainCode {

	public static void display(String a,String b)
	{
		StringBuffer sa = new StringBuffer(a);
		StringBuffer sb = new StringBuffer(b);
		StringBuffer sc = (sa.append("#")).append(sb);
		System.out.println(sc);
	}
}

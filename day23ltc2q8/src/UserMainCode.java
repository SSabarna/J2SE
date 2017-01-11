
public class UserMainCode {

	public static void validatePlayer(String a,String b)
	{
		char c[] = a.toCharArray();
		int i,asc=0;
		for(i=0;i<c.length;i++)
		{
			asc = (int)c[i];
			c[i] = (char)(asc+1);
		}
		String sb = new String(c);
		if(sb.equals(b))
			System.out.println("Valid");
		else
			System.out.println("Invalid");
		
	}
}

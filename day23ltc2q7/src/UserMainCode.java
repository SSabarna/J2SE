
public class UserMainCode {
	public static boolean validateTeam(String a)
	{
		String b = a.toLowerCase();
		char c[] = b.toCharArray();
		int i,o=0,e=0;
		for(i=0;i<c.length;i++)
		{
			if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u')
			{
				if((i+1)%2==0)
					e++;
				else
					o++;
			}
		}
		if(e>o)
			return true;
		else
			return false;
	}
}

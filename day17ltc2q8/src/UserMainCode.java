
public class UserMainCode {
	public static int vowelcount(String s)
	{
		char c[] = s.toCharArray();
		int i,count = 0;
		for(i=0;i<c.length;i++)
		{
			if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u')
				count++;
			else if(c[i]=='A'||c[i]=='E'||c[i]=='I'||c[i]=='O'||c[i]=='U')
				count++;
		}
		return count;
	}
}

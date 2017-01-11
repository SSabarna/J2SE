public class UserMainCode {
	static boolean validatePlayer(String str)
	{
		//int flag1=0;
		/*StringTokenizer st=new StringTokenizer(s1);
		while(st.hasMoreTokens())
		{
			
		}*/
		String[] arr=str.split(" ");
		int n=arr[0].length();
		int m=arr[1].length();
		char ch[]=arr[0].toCharArray();
		char ch1[]=arr[1].toCharArray();
		int i;
		for(i=0;i<n;i++)
		{
			if(i%2==1)
			{
				if(ch[i]=='*')
					continue;
				else
					return false;
			}
		}
		
		for(i=0;i<m;i++)
		{
			if(i%2==1)
			{
				if(ch1[i]=='#')
					continue;
				else
					return false;
			}
		}
		return true;
	}
}

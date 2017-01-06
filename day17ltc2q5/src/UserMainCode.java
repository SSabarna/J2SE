
public class UserMainCode {
public static boolean validateOver(String str)
{
	int c=0;
	if((str.length())<6)
		return false;
	for(int i=0;i<str.length();i++)
	{
		if(str.charAt(i)=='W')
			c++;
		if(str.charAt(i)=='N')
			return false;
	}
	if(c>=1)
		return true;
	return false;
}
}

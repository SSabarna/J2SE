
public class UserMainCode {
	public static boolean validatePlayer(String str)
	{
		for(int i=0;i<str.length();i++)
		{
			if((str.charAt(i)=='a' || str.charAt(i)=='A') && i%2!=0)
				return false;
		}
		return true;
	}
}


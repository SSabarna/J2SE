
public class UserMainCode {

	public static boolean validateTeam(String a)
	{
		String b[] = a.split(" ");
		String[] c = {"RCB", "MI", "CSK", "SRH", "KXIP", "DD", "KKR", "RPSG","GL"};
		int i,count=0;
		try{
		if(Integer.parseInt(b[1])>0)
		{
			for(i=0;i<9;i++)
			{
				if(b[0].equals(c[i]))
				{
					count++;
					break;
				}
			}
		}
		if(count>=1)
			return true;
		else
			return false;
		}
		catch (NumberFormatException e)
		{
			return false;
		}
	}
}

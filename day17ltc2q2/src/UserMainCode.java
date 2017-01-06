import java.util.*;
class UserMainCode {
public static boolean validateTeam(String d)
{
	if(!(d.contains("-")))
	{
		return false;
	}
	String str[] = d.split("-");
	String teamn[] = str[0].split(" ");
	String s = "";
	for(int i =0;i<teamn.length;i++)
	{
		String s1 = teamn[i].substring(0,1).toUpperCase();
		s=s+s1;
	}
	if(str[1].equals(s))
		return true;
	else
		return false;
}
}

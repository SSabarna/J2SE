
public class UserMainCode {
	public static void displayYear(int s)
	{
		boolean b=false;
		if(s%400==0)
			b=true;
		else if(s%100==0)
			b=false;
		else if(s%4==0)
			b=true;
		else
			b=false;
		if(b)System.out.println(s+" is leap year");
		else
			System.out.println(s+" is not leap year");
	}
}

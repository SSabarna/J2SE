import java.text.*;
import java.util.*;
public class UserMainCode {
	public static void displayDate(String s,int n) throws ParseException
	{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		Date d = sdf.parse(s);
		Calendar cal =  Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.DATE, n-1);
		Date d1 = cal.getTime();
		String std =sdf1.format(d1);
		System.out.println(n+"th day of "+s+" : "+std);
	}

}

import java.text.SimpleDateFormat;
import java.util.*;


public class UserMainCode {
	public static void displayDay(String c,String d)
	{
		try
		{
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
			Date dt1=sdf.parse(c);
			Date dt2=sdf.parse(d);
			Calendar c1 = Calendar.getInstance();
			c1.setTime(dt1);

			Calendar c2 = Calendar.getInstance();
			c2.setTime(dt2);

    int sundays = 0;

    while(c2.after(c1)) {
        if(c1.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
            sundays++;
        c1.add(Calendar.DATE,1);
    }
    System.out.println(sundays);
}
catch(Exception e)
{
	e.printStackTrace();
}
}
}
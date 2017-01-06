import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class UserMainCode {
	public static void displayTime(String s) throws ParseException{
		DateFormat df=new SimpleDateFormat("HH:mm:ss");
		Date d=df.parse(s);
		Calendar cal = Calendar.getInstance();
	    cal.setTime(d);
	    cal.add(Calendar.HOUR, +2);
	    Date d1=cal.getTime();
	    String s1=df.format(d1);
	    System.out.println(s1);
	}
}
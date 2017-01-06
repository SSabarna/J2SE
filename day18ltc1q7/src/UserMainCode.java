import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class UserMainCode {
public void displayDay(int s) throws ParseException
	{
		DateFormat d=new SimpleDateFormat("EE");
		
		Calendar date = Calendar.getInstance();
		date.set(Calendar.YEAR, s);
		
		date.set(Calendar.DAY_OF_YEAR,1);
		Date d1=date.getTime();
		System.out.print("Start Day of the given year is ");
	    System.out.println(d.format(d1));
	    date.set(Calendar.DAY_OF_YEAR, date.getActualMaximum(Calendar.DAY_OF_YEAR));
	    Date d2=date.getTime();
	    System.out.print("End Day of the given year is ");
	    System.out.println(d.format(d2));
		
		
	}
}

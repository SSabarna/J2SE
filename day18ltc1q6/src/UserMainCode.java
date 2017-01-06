import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class UserMainCode {
	public void displayDay(int s,int n) throws ParseException
	{
		DateFormat d=new SimpleDateFormat("EEEE");
		
		Calendar date = Calendar.getInstance();
		date.set(Calendar.YEAR, s);
		date.set(Calendar.MONTH,n-1);
		date.set(Calendar.DAY_OF_MONTH,1);
		Date d1=date.getTime();
	    System.out.println(d.format(d1).toUpperCase());
	    date.set(Calendar.DAY_OF_MONTH, date.getActualMaximum(Calendar.DAY_OF_MONTH));
	    Date d2=date.getTime();
	    System.out.println(d.format(d2).toUpperCase());
		
	
		
		
		
	}
}

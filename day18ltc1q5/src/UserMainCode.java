import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class UserMainCode {
public void displayDateDetails(String n) throws ParseException
{
	
	DateFormat d=new SimpleDateFormat("yyyy-MM-dd");
	Date d1=d.parse(n);
	Calendar date = Calendar.getInstance();
	date.setTime(d1);
	date.add(Calendar.YEAR,1);
    System.out.println(d.format(date.getTime()));
    Calendar date2 = Calendar.getInstance();
	date2.setTime(d1);
	date2.add(Calendar.YEAR,-1);
    System.out.println(d.format(date2.getTime()));
	
}
}

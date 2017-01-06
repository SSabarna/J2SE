import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class UserMainCode {
public static void displayDate(String s) throws ParseException
{
	DateFormat d = new SimpleDateFormat("yyyy-MM-dd");
	Calendar c = Calendar.getInstance();
	Date d1 = d.parse(s);
	c.setTime(d1);
	c.add(Calendar.MONTH,20);
	Date d2 = c.getTime();
	System.out.println("20 months after "+s+"will be "+d.format(d2));
	
}
}

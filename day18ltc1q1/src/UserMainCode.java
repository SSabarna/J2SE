import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;


public class UserMainCode {
	public static void displayDate(String str) throws ParseException
	{
		SimpleDateFormat formatter = new SimpleDateFormat("MMMM d,yyyy",Locale.ENGLISH);
		Date d = formatter.parse(str);
		SimpleDateFormat dr = new SimpleDateFormat("yyy-MM-dd");
		String g = dr.format(d);
		System.out.println(g);	
		}
	}

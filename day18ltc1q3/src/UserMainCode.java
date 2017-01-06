import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class UserMainCode {
	public void displayDay(String n) throws ParseException
	{
		DateFormat d=new SimpleDateFormat("yyyy-MM-dd");
		Date d1=d.parse(n);
		DateFormat h=new SimpleDateFormat("DD");
		String g=h.format(d1);
		System.out.print("Day of year : ");
		System.out.print(g);
		
		
		
	}
}

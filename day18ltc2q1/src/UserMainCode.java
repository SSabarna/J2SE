import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class UserMainCode {
public void DisplayDate(int y,int m,int a) throws ParseException
{
	DateFormat d=new SimpleDateFormat("yyyy-MM-dd");
	
	Calendar date1 = Calendar.getInstance();
	Calendar date2 = Calendar.getInstance();
	date1.set(y,(m-1),a);
	date2.set(y,(m-1),a);
	while (date1.get(Calendar.DAY_OF_WEEK) != Calendar.FRIDAY) {
	    date1.add(Calendar.DATE, 1);
	}
    System.out.println("Next Friday: "+d.format(date1.getTime()));
	
    while (date2.get(Calendar.DAY_OF_WEEK) != Calendar.FRIDAY) {
	    date2.add(Calendar.DATE, -1);
	}
    System.out.println("Previous Friday: "+d.format(date2.getTime()));
    
	
}
}

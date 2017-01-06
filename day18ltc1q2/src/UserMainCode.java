import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class UserMainCode {
	public static void displayDateTime(String str) throws ParseException
	{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = sdf.parse(str);
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy, H:mm:ss");
		System.out.println(sdf2.format(date));
	}
}


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;


public class UserMainCode {
public static boolean validateDate(String d)
{
	SimpleDateFormat dt1 = new SimpleDateFormat("dd-MM-yyyy") ;
	//dt1.setLenient(false);
	try
	{
		dt1.parse(d);
	}
	catch(ParseException pe)
	{
		return false;
	}
	return true;
}
}
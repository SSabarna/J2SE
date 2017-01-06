import java.util.*;
import java.text.*;
public class UserMainCode {
public static void displayDate(String a)
{
    try
    {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        
        Date dt1=sdf.parse(a);
        
        Calendar c1 = Calendar.getInstance();
        c1.setTime(dt1);
        c1.add(Calendar.MONTH, -20);
        Date date=c1.getTime();
        System.out.println("20 months before "+a+" will be "+sdf.format(date));
}
catch(Exception e)
{
e.printStackTrace();
}
}
}
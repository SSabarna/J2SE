import java.util.*;
import java.text.*;
public class UserMainCode {
    public static void displayDay(String s) throws Exception
    {
        DateFormat format=new SimpleDateFormat("yyyy-MM-dd");
        DateFormat format1=new SimpleDateFormat("EEEE");
        Date d=format.parse(s);
        Calendar cal=Calendar.getInstance();
        
        cal.setTime(d);
        cal.add(Calendar.DATE, -10);
        Date startDate=cal.getTime();
        String s1=format1.format(startDate);
        System.out.println(format.format(startDate));
        System.out.println(s1);

        cal.setTime(d);
        cal.add(Calendar.DATE, 10);
        Date endDate=cal.getTime();
        String s2=format1.format(endDate);
        System.out.println(format.format(endDate));
        System.out.println(s2);
    }

}

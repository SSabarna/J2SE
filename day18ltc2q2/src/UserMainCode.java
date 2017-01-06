import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
 
 
public class UserMainCode {
public static void displayAge(String s1,String s2) throws ParseException{
SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
Date d1 = sdf1.parse(s1);
Date d2 = sdf1.parse(s2);
int years = 0;
     int months = 0;
     int days = 0;
     //create calendar object for birth day
     Calendar birthDay = Calendar.getInstance();
     birthDay.setTimeInMillis(d1.getTime());
     //create calendar object for current day
     //long currentTime = System.currentTimeMillis();
     Calendar now = Calendar.getInstance();
     now.setTimeInMillis(d2.getTime());
     //Get difference between years
     years = now.get(Calendar.YEAR) - birthDay.get(Calendar.YEAR);
     int currMonth = now.get(Calendar.MONTH)+1;
     int birthMonth = birthDay.get(Calendar.MONTH)+1;
     //Get difference between months
     months = currMonth - birthMonth;
     //if month difference is in negative then reduce years by one and calculate the number of months.
     if (months < 0)
     {
        years--;
        months = 12 - birthMonth + currMonth;
        if (now.get(Calendar.DATE) < birthDay.get(Calendar.DATE))
           months--;
     } else if (months == 0 && now.get(Calendar.DATE) < birthDay.get(Calendar.DATE))
     {
        years--;
        months = 11;
     }else{
      if(now.get(Calendar.DATE) < birthDay.get(Calendar.DATE))
      months--;
     }
     //Calculate the days
     if (now.get(Calendar.DATE) > birthDay.get(Calendar.DATE))
        days = now.get(Calendar.DATE) - birthDay.get(Calendar.DATE);
     else if (now.get(Calendar.DATE) < birthDay.get(Calendar.DATE))
     {
        int today = now.get(Calendar.DAY_OF_MONTH);
        now.add(Calendar.MONTH,-1);
        days = now.getActualMaximum(Calendar.DAY_OF_MONTH) - birthDay.get(Calendar.DAY_OF_MONTH) + today;
     } else
     {
        days = 0;
        if (months == 12)
        {
           years++;
           months = 0;
        }
     }
     //months=months-1;
     System.out.println("I am  "+years+" years, "+months+" months and "+days+" days old.");
 
} 
/*static void displayAge(String s1,String s2){
try {
     Calendar birth = new GregorianCalendar();
     Calendar today = new GregorianCalendar();
     int age = 0;
     int factor = 0; //to correctly calculate age when birthday has not been yet celebrated
     Date birthDate = new SimpleDateFormat("yyyy-MM-dd").parse(s1);
     Date currentDate =new SimpleDateFormat("yyyy-MM-dd").parse(s2);
     
     birth.setTime(birthDate);
     today.setTime(currentDate);
     
     // check if birthday has been celebrated this year
     if(today.get(Calendar.DAY_OF_YEAR) < birth.get(Calendar.DAY_OF_YEAR)) {
           factor = -1; //birthday not celebrated
     }
     age = today.get(Calendar.DATE) - birth.get(Calendar.DATE) + factor;
     System.out.println("AGE (years): "+age);
} catch (ParseException e) {
    // System.out.println("Given date: "+datetext+ " not in expected format (Please enter a MM-DD-YYYY date)");
}
 
}*/
 
}

	import java.text.DateFormat;
	import java.text.ParseException;
	import java.text.SimpleDateFormat;
	import java.util.Calendar;
	import java.util.Date;


	public class UserMainCode {
	public void displayDateDetails(String s,String n) throws ParseException
	{
		DateFormat d=new SimpleDateFormat("yyyy-MM-dd");
		Date d1=d.parse(s);
		Date d2=d.parse(n);
		
		
		Long diff = d2.getTime()-d1.getTime();
		int diffd=(int)(diff/(24*60*60*1000));
		int y=diffd/365;
		int m=(diffd-y*365)/30;

		System.out.println("Difference between "+s+ " and "+n+": "+y+" Years and "+m+" Months");
		
		
	}
	}

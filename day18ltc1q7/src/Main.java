
import java.text.ParseException;
import java.util.*;
public class Main {
public static void main(String args[]) throws ParseException
	{
		int s,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year");
		s=sc.nextInt();
		UserMainCode u=new UserMainCode();
		u.displayDay(s);
	}
}

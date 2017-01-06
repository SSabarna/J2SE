import java.text.ParseException;
import java.util.*;
public class Main {
	public static void main(String args[]) throws ParseException
	{
		String s;
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		UserMainCode u=new UserMainCode();
		u.displayDay(s);
	}
}

import java.text.ParseException;
import java.util.*;
public class Main {
public static void main(String args[]) throws ParseException
	{
		int s,n;
		Scanner sc=new Scanner(System.in);
		s=sc.nextInt();
		sc.nextLine();
		n=sc.nextInt();
		UserMainCode u=new UserMainCode();
		u.displayDay(s,n);
	}
}

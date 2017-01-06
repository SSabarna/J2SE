
import java.text.ParseException;
import java.util.*;
public class Main {
public static void main(String args[]) throws ParseException
{
	int y,m,d;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter year in Integer");
	y=sc.nextInt();
	sc.nextLine();
	System.out.println("Enter Month in Integer");
	m=sc.nextInt();
	sc.nextLine();
	System.out.println("Enter date in Integer");
	d=sc.nextInt();
	UserMainCode u=new UserMainCode();
	u.DisplayDate(y,m,d);
}
}

import java.util.*;
class Main
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int y = s.nextInt();
		UserMainCode u = new UserMainCode();
		System.out.println("Enter the year");
		u.displayYear(y);
	}
}
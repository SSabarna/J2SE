import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the total runs scored");
		float a = Integer.parseInt(s.nextLine());
		System.out.println("Enter the total overs faced");
		float b = Integer.parseInt(s.nextLine());
		float rr = a/b;
		try
		{
		
		if(b<0||b>20)
			throw new OverRangeException("Over is not in the specified range");
		else
			System.out.printf("Current Run Rate :%.2f",rr);
		}
		catch(OverRangeException e)
		{
			System.out.println(e.getClass().getCanonicalName()+": "+e.getMessage());
		}
		
	}

}

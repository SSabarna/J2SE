import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int i;
			System.out.println("Enter the number of overs");
			int overs = Integer.parseInt(sc.nextLine());
			if(overs<0)
				throw new NegativeArraySizeException();
			System.out.println("Enter the number of runs for each over");
			int runsperover[] = new int[overs];
			for(i=0;i<overs;i++)
			{
				runsperover[i] = Integer.parseInt(sc.nextLine());
			}
			System.out.println("Enter the over number");
			int overkey = Integer.parseInt(sc.nextLine());
			if(overkey>overs)
				throw new ArrayIndexOutOfBoundsException();
			/*if(overkey<0)
				throw new NegativeArraySizeException();*/
			for(i=0;i<overs;i++)
			{
				if(i+1==overkey)
				{
					System.out.println(runsperover[i]);
					System.exit(0);
				}
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getClass().getCanonicalName());
		}
		

	}

}

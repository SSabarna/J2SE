import java.util.Scanner;


public class Main extends Thread{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int i;
		SortScore[] ss = new SortScore[3];
		for(i=0;i<3;i++)
		{
			System.out.println("Enter the Match :");
			String a = s.nextLine();
			System.out.println("Enter the Scores :");
			String b = s.nextLine();
			ss[i]= new SortScore(a,b);
			ss[i].start();
		}
		System.out.println("Ordered Score List");
		for(i=0;i<3;i++)
		{
			ss[i].getScores();
		}
	}

}

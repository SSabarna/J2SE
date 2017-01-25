import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;


public class Main {
	public static void main(String[] args) {
		String name;
		long score;
		Scanner sc=new Scanner(System.in);
		TreeSet<Ranking> s = new TreeSet<Ranking>();
		System.out.println("Please provide the number of  players");
		int n=Integer.parseInt(sc.nextLine());
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the name of the player "+(i+1));
			name=sc.nextLine();
			System.out.println("Enter the score of the player "+(i+1));
			score=Long.parseLong(sc.nextLine());
			s.add(new Ranking(name, score));
		}
		System.out.println("Player Details by Score(High to Low)");
		Iterator<Ranking> it=((TreeSet<Ranking>) s).descendingIterator();
		int i=1;
		while(it.hasNext()){
			System.out.println(i+" "+it.next());
			i++;
		}	

	}

}
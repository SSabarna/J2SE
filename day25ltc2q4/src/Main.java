import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;


public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		TreeSet<Player> ts=new TreeSet<Player>();
		long cap;
		String skill;
		String name;
		System.out.println("Enter number of players:");
		int n=Integer.parseInt(in.nextLine());
		for (int i = 0; i < n; i++) {
			System.out.println("Enter player "+(i+1)+" detail");
			System.out.println("Enter Name");
			 name=in.nextLine();
			System.out.println("Enter Skill");
			skill=in.nextLine();
			System.out.println("Enter Cap Number");
			cap=Long.parseLong(in.nextLine());
			ts.add(new Player(name,skill,cap));
		}
		System.out.println("Player list after sorting by cap number in descending order");

		Iterator<Player> itr=((TreeSet<Player>)ts).descendingIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			
		}
	}
}
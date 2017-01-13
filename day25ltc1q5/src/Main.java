import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class Main {

	public static void main(String[] args) {
		String ans="yes";
		String name;
		String skill;
		int c=0;
		
		Scanner sc=new Scanner(System.in);
		
		HashSet<Player> s = new HashSet<Player>();
		while(ans.equals("yes")){
			System.out.println("Enter Player Name:");
			name=sc.nextLine();
			System.out.println("Enter Skill:");
			skill=sc.nextLine();
			Player p=new Player(name, skill);
			Iterator<Player> it2=s.iterator();
			while(it2.hasNext()){
				c=0;
				if(it2.next().getName().equals(name)){
					System.out.println("Player "+name+" already exist");
					
					c++;
					break;
				}
			}
			if(c==0)
			    s.add(p);
			System.out.println("Do you want to continue(yes/no):");
			ans=sc.nextLine();
		}
		
		IndexBuilder ib=new IndexBuilder();
		TreeSet<Index> i=ib.buildIndex(s);
		ib.displayIndex(i);

	}

}

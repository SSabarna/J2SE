import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;


public class Main {
	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of best bowlers in season 4");
		int n1 = Integer.parseInt(sc.nextLine());
		HashSet<String> h1 = new HashSet<String>();
		System.out.println("Enter the name of players");
		for(i=0;i<n1;i++)
			h1.add(sc.nextLine());
		System.out.println("Enter the number of best bowlers in season 5");
		int n2 = Integer.parseInt(sc.nextLine());
		HashSet<String> h2 = new HashSet<String>();
		System.out.println("Enter the name of players");
		for(i=0;i<n2;i++)
			h2.add(sc.nextLine());
		HashSet<String> h3 = new HashSet<String>(h1);
		h3.removeAll(h2);
		System.out.println("Player Set 1");
		for(String a:h1)
			System.out.println(a);
		System.out.println("Player Set 2");
		for(String b:h2)
			System.out.println(b);
		System.out.println("Difference");
		for(String str:h3)
			System.out.println(str);
		

	}

}

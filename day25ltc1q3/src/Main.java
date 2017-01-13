import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;


public class Main {
	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		ArrayList<String> arl = new ArrayList<String>();
		System.out.println("Enter the number of bowlers");
		for(i=0;i<n;i++)
			arl.add(sc.nextLine());
		System.out.println("Players list in ascending order");
		TreeSet<String> ts = new TreeSet<String>(arl);
		for(String a:ts)
			System.out.println(a);

	}

}

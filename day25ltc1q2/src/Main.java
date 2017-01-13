import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;


public class Main {
	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		TreeSet<String> ts = new TreeSet<String>();
		for(i=0;i<n;i++)
			ts.add(sc.nextLine());
		for(String a:ts)
			System.out.println(a);

	}

}

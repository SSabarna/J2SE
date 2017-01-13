import java.util.HashSet;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner(System.in);
		HashSet<String> hs = new HashSet<String>();
		int n = Integer.parseInt(sc.nextLine());
		for(i=0;i<n;i++)
			hs.add(sc.nextLine());
		System.out.println(hs.size());
		

	}

}

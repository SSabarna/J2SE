import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		ArrayList<Integer> arl = new ArrayList<Integer>();
		for(i=0;i<n;i++)
			arl.add(Integer.parseInt(sc.nextLine()));
		Collections.sort(arl);
		for(i=0;i<arl.size();i++)
			System.out.println(arl.get(i));

	}

}

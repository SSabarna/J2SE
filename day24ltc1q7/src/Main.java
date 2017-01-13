import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner(System.in);
		ArrayList<String> arl = new ArrayList<String>();
		for(i=0;i<5;i++)
			arl.add(sc.nextLine());
		System.out.println("Enter swap positons");
		int start = Integer.parseInt(sc.nextLine());
		int end = Integer.parseInt(sc.nextLine());
		Collections.swap(arl,start,end);
		for(i=0;i<arl.size();i++)
			System.out.println(arl.get(i));

	}

}

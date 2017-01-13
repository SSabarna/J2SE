import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner(System.in);
		ArrayList<String> arl = new ArrayList<String>();
		arl.add(sc.nextLine());
		String s[] = arl.get(0).toString().split("");
		for(i=s.length-1;i>=0;i--)
			System.out.println(s[i]);

	}

}

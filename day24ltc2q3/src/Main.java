import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		int i,f=0,h=0;
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		ArrayList<Integer> arl = new ArrayList<Integer>();
		for(i=0;i<n;i++)
			arl.add(Integer.parseInt(sc.nextLine()));
		for(i=0;i<arl.size();i++)
		{
			if(arl.get(i)>=50 && arl.get(i)<100)
				f++;
			if(arl.get(i)>=100)
				h++;
		}
		System.out.println(f);
		System.out.println(h);

	}

}

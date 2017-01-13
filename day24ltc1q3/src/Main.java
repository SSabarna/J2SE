import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		int i,c=0;
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		ArrayList<String> arl = new ArrayList<String>();
		for(i=0;i<n;i++)
			arl.add(sc.nextLine());
		
		String key = sc.nextLine();
		//int o = Collections.frequency(arl, key);
		for(i=0;i<arl.size();i++)
		{
			if(arl.get(i).equals(key))
				c++;
		}
		System.out.println(c);

	}

}

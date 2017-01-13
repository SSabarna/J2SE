import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		int i,sum = 0;
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		ArrayList<Integer> arl = new ArrayList<Integer>();
		for(i=0;i<n;i++)
			arl.add(Integer.parseInt(sc.nextLine()));
		for(i=0;i<arl.size();i++)
			if((i+1)%2==0)
				sum = sum+arl.get(i);
		System.out.println(sum);

	}

}

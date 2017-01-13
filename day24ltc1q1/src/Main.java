import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		int i,sum = 0;
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		ArrayList<Integer> arl = new ArrayList<Integer>();
		//Arraylist arl = new ArrayList();
		for(i=0;i<n;i++)
			arl.add(Integer.parseInt(sc.nextLine()));
		for(i=0;i<arl.size();i++)
			sum = sum + arl.get(i);
		System.out.println(sum);
		System.out.printf("%.1f",(float)sum/n);
		

	}

}

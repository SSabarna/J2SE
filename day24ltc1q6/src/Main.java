import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the teams in ranking table");
		ArrayList<String> arl = new ArrayList<String>();
		for(i=0;i<5;i++)
			arl.add(sc.nextLine());
		System.out.println("Enter the rank to be searched");
		int n = Integer.parseInt(sc.nextLine());
		for(i=0;i<arl.size();i++)
			if(n==(i+1))
				System.out.println(arl.get(i));

	}

}

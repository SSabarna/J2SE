import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the team name");
		String tn = sc.nextLine();
		System.out.println("Enter the number of matches played in home ground");
		int n1 = Integer.parseInt(sc.nextLine());
		ArrayList<Integer> arl1 = new ArrayList<Integer>();
		System.out.println("Enter the runs scored");
		for(i=0;i<n1;i++)
			arl1.add(Integer.parseInt(sc.nextLine()));
		System.out.println("Enter the number of matches played in other ground");
		int n2 = Integer.parseInt(sc.nextLine());
		System.out.println("Enter the runs scored");
		for(i=0;i<n2;i++)
			arl1.add(Integer.parseInt(sc.nextLine()));
		System.out.println("Runs scored by "+tn);
		for(i=0;i<arl1.size();i++)
			System.out.println(arl1.get(i));
		System.out.println("Run scored by "+tn+" more than 300");
		for(i=0;i<arl1.size();i++)
			if(arl1.get(i)>300)
				System.out.println(arl1.get(i));

	}

}

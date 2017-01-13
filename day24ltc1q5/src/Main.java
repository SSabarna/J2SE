import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner(System.in);
		ArrayList<String> arl1 = new ArrayList<String>();
		ArrayList<String> arl2 = new ArrayList<String>();
		System.out.println("Enter the top 5 scorers of IPL Season 8");
		for(i=0;i<5;i++)
			arl1.add(sc.nextLine());
		System.out.println("Enter the top 5 scorers of IPL Season 9");
		for(i=0;i<5;i++)
			arl2.add(sc.nextLine());
		System.out.println("Consistent run scorers");
		arl1.retainAll(arl2);
		for(i=0;i<arl1.size();i++)
			System.out.println(arl1.get(i));
		

	}

}

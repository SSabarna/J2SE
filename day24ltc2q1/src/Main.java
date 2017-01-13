import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		ArrayList<String> arl = new ArrayList<String>();
		for(i=0;i<n;i++)
			arl.add(sc.nextLine());
		String ch = "Yes";
		while(ch.equals("Yes"))
		{
			System.out.println("Menu\n1.Insert Players\n2.Delete Players");
			int a = Integer.parseInt(sc.nextLine());
			switch(a)
			{
				case 1:
				{
					arl.add(sc.nextLine());
					System.out.println("Player details after insertion");
					for(i=0;i<arl.size();i++)
						System.out.println(arl.get(i));
					System.out.println("Do you want to continue");
					ch = sc.nextLine();
					break;
				}
				case 2:
				{
					arl.remove(sc.nextLine());
					System.out.println("Player details after deletion");
					for(i=0;i<arl.size();i++)
						System.out.println(arl.get(i));
					System.out.println("Do you want to continue");
					ch = sc.nextLine();
					break;
				}
				default:
				{
					System.exit(0);
				}
			}
		}

	}

}
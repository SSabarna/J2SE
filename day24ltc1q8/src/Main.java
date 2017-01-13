import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the player details");
		ArrayList<String> arl = new ArrayList<String>();
		System.out.println("Enter player name");
		arl.add(sc.nextLine());
		System.out.println("Enter age");
		arl.add(sc.nextLine());
		System.out.println("Enter Country"); 
		arl.add(sc.nextLine());
		System.out.println("Player Details"); 
		for(i=0;i<arl.size();i++)
			System.out.println(arl.get(i));
		System.out.println("Enter Skill");
		String skill = sc.nextLine();
		System.out.println("Enter the position to add the skill");
		int pos1 = Integer.parseInt(sc.nextLine());
		arl.set(pos1,skill);
		System.out.println("Player Details"); 
		for(i=0;i<arl.size();i++)
			System.out.println(arl.get(i));
		System.out.println("Enter the position of the detail to be removed");
		int pos2 = Integer.parseInt(sc.nextLine());
		arl.remove(pos2);
		System.out.println("Player Details"); 
		for(i=0;i<arl.size();i++)
			System.out.println(arl.get(i));
		

	}

}

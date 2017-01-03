
import java.util.Scanner;
public class Main {
	public static void main(String args[])
	{
		String pn,c,sk;
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of Players");
		n=sc.nextInt();
		sc.nextLine();
		Player p[]=new Player[n];
		Skill s[]=new Skill[n];
		for(int i=1;i<=n;i++)
		{
			System.out.println("Enter player "+i+" details:");
			System.out.println("Enter player name");
			pn=sc.nextLine();
			System.out.println("Enter country name");
			c=sc.nextLine();
			System.out.println("Enter skill");
			sk=sc.nextLine();
			s[i-1]= new Skill(sk);
			p[i-1]=new Player(pn,c,s[i-1]);	
		}
		PlayerBO obj=new PlayerBO();
		while(true)
		{
		System.out.println("Menu:");
		System.out.println("1.View details");
		System.out.println("2.Filter players with skill");
		System.out.println("3.Exit");
		String r=sc.nextLine();
		switch(r)
		{
		case "1":
			obj.viewDetails(p);
			break;
			
		case "2":
			System.out.println("Enter skill");
			String st=sc.nextLine();
			obj.printPlayerDetailsWithSkill(p,st);
			break;
		
		case "3":
		
			System.exit(0);
		
			
		}
		
		}
		
	}

}

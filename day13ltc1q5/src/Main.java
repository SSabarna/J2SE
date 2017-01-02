import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of venues");
		int x=sc.nextInt();
		sc.nextLine();
		Venue obj[] = new Venue[x];
		for(int i=0;i<x;i++)
		{
			System.out.println("Enter the details of venue "+(i+1));
			String n=sc.nextLine();
			String p[] = n.split(",",2);
			obj[i] = new Venue(p[0],p[1]);
			obj[i].setName(p[0]);
			obj[i].setCity(p[1]);
		}
		System.out.println("Venue Details");
		for(int i=0;i<x;i++)
		{
		System.out.println("Venue Name : "+obj[i].getName());
		System.out.println("City Name : "+obj[i].getCity());
		}

	}

}

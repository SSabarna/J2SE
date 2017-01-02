import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of venues");
		int n = sc.nextInt();
		sc.nextLine();
		Venue v[] = new Venue[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the details of venue "+(i+1));
		String v1 = sc.nextLine();
		String stadium=v1.split(",")[0];
		String city= v1.split(",")[1];
		v[i]=new Venue(stadium, city);
		//v[i].getStadiumName()=v1.split(",")[0];
		
		}
		System.out.println("Venue Details");
		for(int i=0;i<n;i++)
		{
			System.out.println("Venue "+(i+1));
			System.out.println("Stadium Name : "+v[i].getStadiumName());
			System.out.println("City Name : "+v[i].getCity());
		}

	}

}

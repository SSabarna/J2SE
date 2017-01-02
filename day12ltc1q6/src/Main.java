import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n;
		System.out.println("Enter the venue details");
		n=sc.nextLine();
		String[] parts = n.split(",",2);
		String part1 = parts[0]; 
		String part2 = parts[1]; 
		
		Venue obj=new Venue();
		obj.name=part1;
		obj.city=part2;
		System.out.println("Venue Details");
		System.out.println("Venue Name : "+obj.name);
		System.out.println("City Name : "+obj.city);
	}

}

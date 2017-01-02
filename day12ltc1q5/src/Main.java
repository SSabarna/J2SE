import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the player details");
		String n=sc.nextLine();
		String[] parts = n.split(",",3);
		String part1 = parts[0]; 
		String part2 = parts[1]; 
		String part3 = parts[2];
		Player obj=new Player();
		obj.name=part1;
		obj.country=part2;
		obj.skill=part3;
		System.out.println("Player Details :");
		System.out.println("Player Name : "+obj.name);
		System.out.println("Country Name : "+obj.country);
		System.out.println("Skill : "+obj.skill);
	}
}

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the extratype details");
		String n = sc.nextLine();
		String[] parts = n.split("#",2);
		String part1 = parts[0];
		String part2 = parts[1];
		long r = Long.valueOf(part2);
		ExtraType obj = new ExtraType();
		obj.name = part1;
		obj.runs = r;
		System.out.println("ExtraType Details");
		System.out.println("Extra Type:"+obj.name);
		System.out.println("Runs:"+obj.runs);
	}

}

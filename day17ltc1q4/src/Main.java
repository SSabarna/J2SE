import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter team name");
		String str = sc.nextLine();
		System.out.println("Enter starting index of the sequence");
		int s = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter ending index of the sequence");
		int e = sc.nextInt();
		System.out.println(str.subSequence(s,e));

	}

}

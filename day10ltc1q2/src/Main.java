import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n%6==5 || n%6==2)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}

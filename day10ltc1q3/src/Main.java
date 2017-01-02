import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c1 = sc.nextInt();
		int c2 = sc.nextInt();
		int c3 = sc.nextInt();
		int x = sc.nextInt();
		int have = x-n;
		if(have>=(c1+c2+c3))
			System.out.println(3);
		else if(have>=(c1+c2)||have>=(c2+c3)||have>=(c1+c3))
			System.out.println(2);
		else if(have>=c1||have>=c2||have>=c3)
			System.out.println(1);
		else
			System.out.println(0);
	}

}

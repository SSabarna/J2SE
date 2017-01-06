import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		int i,x=0,y=0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String str = sc.nextLine();
		for(i=0;i<n;i++)
		{
			if(str.charAt(i)=='U')
				y=y+1;
			if(str.charAt(i)=='D')
				y=y-1;
			if(str.charAt(i)=='R')
				x=x+1;
			if(str.charAt(i)=='L')
				x=x-1;
		}
		System.out.println(x+" "+y);

	}

}

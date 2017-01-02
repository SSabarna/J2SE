import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=i;j>=1;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}

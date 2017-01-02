import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int i,sum=0,max,min;
		Scanner sc=new Scanner(System.in);
		min=sc.nextInt();
		max=sc.nextInt();
		for(i=min;i<=max;i++)
		{
			sum=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					sum=sum+j;
				}
			}
			if(sum<2*i)
				System.out.print(i+" ");
		}
	}
}
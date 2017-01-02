import java.util.Scanner;

public class Main
{
	public static void main(String args[])
	{
		int a,b,i,j,flag=0;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		for(i=a;i<=b;i++)
		{
			if(i==2)
				flag=1;
			else
				for(j=2;j<i;j++)
				{
					if(i%j==0)
					{
						flag=0;
						break;
					}
					else
					{
					flag=1;
					}
				}
			if(flag==1)
			{
				System.out.print(i+" ");
			}
		}
	}
}
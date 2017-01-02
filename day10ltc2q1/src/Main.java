import java.util.Scanner;
public class Main {
	public static void main(String args[])
	{
		int temp,i,j,flag=0,x=0;
		Scanner sc=new Scanner(System.in);
		int start=sc.nextInt();
		int end=sc.nextInt();
		for(i=start;i<=end;i++)
		{
			x=0;
			temp=i;
			while(temp!=0)
			{
				int c=temp%10;
				flag=0;
				if(checkp(c)&&c>0)
					x++;
				temp=temp/10;
			}
			if(x==2)
				System.out.print(i+" ");
		}
	}
	static boolean checkp(int n)
	{
		int fact=0,j=1;
		while(j<=n)
		{
			if(n%j==0)
			{
				fact++;
			}
			j++;
		}
		return(fact==2);
	}
}
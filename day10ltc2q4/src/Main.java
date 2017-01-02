import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		int temp,a,b,i,j,e=0,o=0;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		for(i=a;i<=b;i++)
		{
			temp=i;
			e=0;
			o=0;
			while(temp!=0)
			{
				int rem=temp%10;
				if(rem!=0)
					if(rem%2==0)
						e++;
					else
						o++;
				temp=temp/10;
			}
			if(e==2 && o==2)
				System.out.print(i+" ");
		}
	}
}
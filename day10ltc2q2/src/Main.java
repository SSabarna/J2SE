import java.util.Scanner;

public class Main
{
	public static void main(String args[])
	{
		int num,r,sum,temp,max,min;
		Scanner sc=new Scanner(System.in);
		min=sc.nextInt();
		max=sc.nextInt();
		for(num=min;num<=max;num++)
		{ 
			temp=num;
			sum=0;
			while(temp>0)
			{
				r=temp%10;
				sum= sum*10+r;
				temp=temp/10;
			}
			if(num==sum)
				System.out.print(num+" ");
			}
		}
	}

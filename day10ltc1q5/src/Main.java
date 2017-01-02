import java.util.Scanner;

		public class Main {
			public static void main(String args[])
			{
				Scanner s=new Scanner(System.in);
				int s1,s2,s3,x;
				s1=s.nextInt();
				s2=s.nextInt();
				s3=s.nextInt();
				x=s.nextInt();
				boolean a=s.nextBoolean();
				if(a==true)
				{
					System.out.println("3");
				}
				else{
				if(s1+s2+s3<=x)
				{
					System.out.println("3");
				}
				else if(s1+s2<=x || s1+s3<=x || s2+s3<=x)
				{
					System.out.println("2");
				}
				else if(s1<=x || s2<=x ||s3<=x)
				{
					System.out.println("1");
				}
				else 
					System.out.println("0");
				}
			}
		}
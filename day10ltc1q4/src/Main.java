import java.util.Scanner;
	public class Main {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		if((a>=100&&b>=100)||(b>=100&& c>=100)||(c>=100)&&(a>=100)||( a>=50&&b>=50&&c>=50))
			System.out.println("Selected") ;
		else if(a>=100||b>=100||c>=100||(a>=50&&b>=50)||(b>=50&&c>=50)||( c>=50&&a>=50))
			System.out.println(" Waitlisted");
		else
			System.out.println("Rejected") ;
			}
		}

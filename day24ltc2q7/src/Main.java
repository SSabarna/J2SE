import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	public static boolean isPrime(int n)
	{
		int i,count=0;
		for(i=1;i<=n;i++)
			if(n%i==0)
				count++;
		if(count==2)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		int i,c=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of matches");
		int n = Integer.parseInt(sc.nextLine());
		System.out.println("Enter the runs scored by the team");
		ArrayList<Integer> arl = new ArrayList<Integer>();
		for(i=0;i<n;i++)
			arl.add(Integer.parseInt(sc.nextLine()));
		for(i=0;i<n;i++)
			if(isPrime((Integer)arl.get(i)))
				c++;
		System.out.println("Number of prime scores : "+c);
		}

	}



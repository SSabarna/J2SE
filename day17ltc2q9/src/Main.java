import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		int k=0;
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		for(int i=0;i<n.length()-2;i++)
		{
			String f = n.substring(i,i+3);
			Long h = Long.parseLong(f);
			if(h%4==0)
				k++;
		}
		System.out.println(k);

	}

}

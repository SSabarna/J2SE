import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of wickets");
        int n = sc.nextInt();
        sc.nextLine();
        Wicket ob[] = new Wicket[n];
        for(int i=0;i<n;i++)
        {
			System.out.println("Enter the details of wicket "+(i+1));
			String str=sc.nextLine();
			String array[] = str.split(",");
			Long t=Long.parseLong(array[0]);
			Long t1=Long.parseLong(array[1]);
			ob[i] = new Wicket(t,t1,array[2],array[3],array[4]);
		}
        WicketBO wb = new WicketBO();
        wb.displayAllWicketDetails(ob);
        System.out.println("Enter the wicket type to be searched");
        String type = sc.nextLine();
        wb.displaySpecificWicketDetails(ob,type);


	}

}

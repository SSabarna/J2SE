import java.util.*;
public class Main {
public static  int value[];
	public static void main(String[] args) throws InterruptedException {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of Players");
		int n=Integer.parseInt(sc.nextLine());
		value=new int[n];
		Main m=new Main();
		TeamThread tt=new TeamThread(m, n);
		tt.start();
		tt.join();
		PlayerThread pt=new PlayerThread(m, n);
		pt.start();
		
		

	}

}

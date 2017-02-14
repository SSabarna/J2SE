import java.util.*;
public class Main extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of Players");
		int n = Integer.parseInt(s.nextLine());
		
		Main m = new Main();
		
		TeamThread tt = new TeamThread(m,n);
		PlayerThread pt = new PlayerThread(m,n);
		Thread t1 = new Thread(tt,"t1");
		//Thread t2 = new Thread(pt,"t2");
		t1.start();
	}

}

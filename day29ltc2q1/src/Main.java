import java.util.*;
public class Main {
public static void main(String args[]) throws InterruptedException
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter range of numbers");
	int s=Integer.parseInt(sc.nextLine());
	int e=Integer.parseInt(sc.nextLine());
	Scores scr=new Scores(s,e,"Odd");
	Scores scr1=new Scores(s,e,"Even");
	Thread t=new Thread(scr);
	Thread t1=new Thread(scr1);
	t.start();
	t.join();
	t1.start();
	t1.join();
	
}
}

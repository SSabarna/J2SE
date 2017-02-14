import java.util.*;


public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String summary="";
		System.out.println("Enter the number of lines in the summary");
		Integer n=Integer.parseInt(sc.nextLine());
		TitleCaseThread[] t=new TitleCaseThread[n];
		Thread th[]=new Thread[n];
		for(int i=0;i<n;i++){
			summary=sc.nextLine();
			t[i] = new TitleCaseThread(summary);
			th[i]= new Thread(t[i]);
			th[i].start();
			try {
				th[i].join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		for(int i=0;i<n;i++){
			System.out.println("Sentence "+(i+1)+" : "+t[i].getModifiedSummary());
		}
		

	}

}
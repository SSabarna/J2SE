
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String m;
		String s;
	
			System.out.println("Enter the match :");
			m=sc.nextLine();
			System.out.println("Enter the scores :");
			s=sc.nextLine();
			CalculateScores ss=new CalculateScores(m,s);
			Thread t1=new Thread(ss);
			t1.start();
			try{  
				  t1.join();  
				 }catch(Exception e){System.out.println(e);}  
			System.out.println("Enter the match :");
			m=sc.nextLine();
			System.out.println("Enter the scores :");
			s=sc.nextLine();
			CalculateScores ss1=new CalculateScores(m,s);
			Thread t2=new Thread(ss1);
			t2.start();
			try{  
				  t2.join();  
				 }catch(Exception e){System.out.println(e);}  
			System.out.println("Enter the match :");
			m=sc.nextLine();
			System.out.println("Enter the scores :");
			s=sc.nextLine();
			CalculateScores ss2=new CalculateScores(m,s);
			Thread t3=new Thread(ss2);
			t3.start();
			try{  
				  t3.join();  
				 }catch(Exception e){System.out.println(e);}  
			System.out.println("Score Summary");
			System.out.println("Match : "+ss.getMatchType());
			System.out.printf("Mean : %.2f\n",ss.meanScore);
			System.out.println("Min Score : "+ss.minScore);
			System.out.println("Max Score : "+ss.maxScore);
			
			System.out.println("Match : "+ss1.getMatchType());
			System.out.printf("Mean : %.2f\n",ss1.meanScore);
			System.out.println("Min Score : "+ss1.minScore);
			System.out.println("Max Score : "+ss1.maxScore);
			
			System.out.println("Match : "+ss2.getMatchType());
			System.out.printf("Mean : %.2f\n",ss2.meanScore);
			System.out.println("Min Score : "+ss2.minScore);
			System.out.println("Max Score : "+ss2.maxScore);
			
	}

}

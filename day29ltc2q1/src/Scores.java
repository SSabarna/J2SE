import java.util.*;


public class Scores extends Thread {
	int start;  
	int end; 
	String scoreType; 
	List<Integer>scoreList=new ArrayList<Integer>();
	
	public Scores(int start, int end, String scoreType) {
		super();
		this.start = start;
		this.end = end;
		this.scoreType = scoreType;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		if(scoreType.equals("Odd"))
		{
	System.out.println( scoreType+" numbers in given range");
	for(int i=start;i<=end;i++)
	{
		if(i%2!=0)
			System.out.print(i+" ");
		else
			continue;
	}
		}
		else 
		{
			System.out.println();
			System.out.println( scoreType+" numbers in given range");
		for(int i=start;i<=end;i++)
		{
			if(i%2==0)
				System.out.print(i+" ");
			else
				continue;
				
				
		}
		}
	}
}

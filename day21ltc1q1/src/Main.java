import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Enter the total runs scored");
			int runs = Integer.parseInt(br.readLine());
			System.out.println("Enter the total overs faced");
			int scores = Integer.parseInt(br.readLine());
			float runrate = (float)runs/scores;
			if(scores==0)
				throw new ArithmeticException();
			else
				System.out.printf("Current Run Rate : %.2f",runrate);
		}
		catch(Exception e){
			System.out.println(e.getClass().getCanonicalName());
			
		}
			
		
		

	}

}

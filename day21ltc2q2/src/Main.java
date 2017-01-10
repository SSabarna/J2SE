import java.io.*;
public class Main {
	public static void main(String[] args)throws IOException
	{
		String[] list={"Chennai Super Kings",
				"Deccan Chargers",
				"Delhi Daredevils",
				"Kings XI Punjab",
				"Kolkata Knight Riders",
				"Mumbai Indians",
				"Rajasthan Royals",
				"Royal Challengers Bangalore"};
		int i,f=0,f1=0;
		String w,r;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		try{
			System.out.println("Enter the expected winner team of IPL Season 4");
			w=br.readLine();
			for(i=0;i<list.length;i++)
			{
				if(w.equals(list[i]))
				{
					f=1;
					break;
				}
			}
			if(f==0)
			{
				throw new TeamNameNotFoundException("Entered team is not a part of IPL Season 4");
			}
		
			System.out.println("Enter the expected runner Team of IPL Season 4");
			r=br.readLine();
			
			for(i=0;i<list.length;i++)
			{
				if(r.equals(list[i]))
				{
					f1=1;
					break;
				}
			}
			if(f1==0)
			{
				throw new TeamNameNotFoundException("Entered team is not a part of IPL Season 4");
			}
			
			System.out.println("Expected IPL Season 4 winner: "+w);
			System.out.println("Expected IPL Season 4 runner: "+r);
		
			
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
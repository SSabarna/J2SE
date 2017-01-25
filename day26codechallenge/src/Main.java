import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i;
		Map<String,Long> hmap=new HashMap<String,Long>();
		System.out.println("Enter the number of players");
		int n=Integer.parseInt(br.readLine());
		for(i=0;i<n;i++)
		{
			System.out.println("Enter the details of the player "+(i+1));
			String pn=br.readLine();
			long run=Integer.parseInt(br.readLine());
			hmap.put(pn, run);
		}
		long max=0;
		String K = null;
		for(String key : hmap.keySet())
		{
			Long p=hmap.get(key);
			if(max<p)
			{
				max=p;
				K=key;
			}
		}
		System.out.println(K);
	}

}


import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		//String fileName = "outcome.txt";
		int a = Integer.parseInt(bf.readLine());
		int b = Integer.parseInt(bf.readLine());
		//BufferedReader br=new BufferedReader(new FileReader(fileName));
		String line,st="";
		File file = new File("matchsummary.txt");
		BufferedReader br=new BufferedReader(new FileReader(file));
		String word;
		while((word=br.readLine())!=null)
		{
		    st = st + word;
		}
		
		char[] ch = st.toCharArray();
		int i;
		for(i=a;i<b;i++)
		{
			System.out.print(ch[i]);
		}

	}

}

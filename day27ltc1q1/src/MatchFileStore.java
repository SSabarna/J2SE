import java.io.*;
import java.util.*;


public class MatchFileStore {
	List<Match> obtainMatchFromFile(File in){
		
		List<Match> list=new ArrayList<Match>();
		 try
		    {
		        BufferedReader br = new BufferedReader(new FileReader(in));
		        String line;
		        while ((line = br.readLine()) != null)
		        {
		            line.trim();
		            String teamOne=line.substring(0, (0+5)).trim();
		        	String teamTwo=line.substring(5, (5+5)).trim();
		        	String venue=line.substring(10, (10+20)).trim();
		        	String matchDate=line.substring(30, (30+10)).trim();
		        	Match m=new Match(teamOne, teamTwo, venue, matchDate);
		        	list.add(m);
		        }
		        br.close();
		    }
		    catch (FileNotFoundException e) {
		        e.printStackTrace();
		    } catch (IOException e) {
		        e.printStackTrace();
		    }
		
		return list;
	}

}

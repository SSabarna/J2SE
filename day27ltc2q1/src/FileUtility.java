import java.io.*;
import java.util.*;


public class FileUtility {
	private static final String nl = "\n";
	List<Player> readFileData(BufferedReader br){
		List<Player> list=new ArrayList<Player>();
		 try
		    {
		        String line;
		        while ((line = br.readLine()) != null)
		        {
		            String[] str=line.split(",");
		            Integer capNumber=Integer.parseInt(str[0]);
		        	String playerName=str[1];
		        	String skill=str[2];
		        	String country=str[3];
		        	Integer matchesPlayed=Integer.parseInt(str[4]);
		        	Player p=new Player(capNumber, playerName, skill, country, matchesPlayed);
		        	list.add(p);
		        }
		        br.close();
		    }
		    catch (FileNotFoundException e) {
		        System.out.println(e);
		    } catch (IOException e) {
		       System.out.println(e);
		    }
		 return list;
		
	}
	
	void writeDataToFile(List<Player> playerList) throws IOException{
		String fileName="player.csv";
		FileWriter fileWriter = null;
		try
		{
			fileWriter = new FileWriter(fileName);
			for(int i=0;i<playerList.size();i++){
				fileWriter.write(String.valueOf(playerList.get(i)));
				
			}
			
			
		}catch(Exception e)
		{}
		finally
		{
			fileWriter.flush();
			fileWriter.close();
			
		}
		
	}

}

import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		String pname;
		//File fl;
		System.out.println("Enter the name of the player");
		pname=bf.readLine();
		System.out.println("Enter the team name");
		String tname=bf.readLine();
		System.out.println("Enter the number of matches played");
		int nm=Integer.parseInt(bf.readLine());
		File f1 = new File(pname, tname, nm);
		//fl.writeCsvFile("player.csv");
		String fileName="player.csv";
		FileWriter fileWriter = null;
		try
		{	;
			fileWriter = new FileWriter(fileName);
			fileWriter.append(String.valueOf(f1.getName()));
			fileWriter.append(",");
			fileWriter.append(String.valueOf(f1.getTeamName()));
			fileWriter.append(",");
			fileWriter.append(String.valueOf(f1.getNumberOfMatches()));

		}
		catch(Exception e)
		{}
		finally
		{
			fileWriter.flush();
			fileWriter.close();
			
		}

	}

}

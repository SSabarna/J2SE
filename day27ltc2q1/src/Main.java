import java.io.*;
import java.util.*;


public class Main {

	public static void main(String[] args) throws IOException {
		FileUtility fu=new FileUtility();
		File in=new File("input.txt");
		BufferedReader br=new BufferedReader(new FileReader(in));
		List<Player> l= fu.readFileData(br);
		Collections.sort(l);
		fu.writeDataToFile(l);

	}

}

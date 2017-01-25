import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		File f=new File("matches.txt");
		MatchFileStore mf=new MatchFileStore();
		File in=new File("matches.txt");
		List<Match> l= mf.obtainMatchFromFile(in);
		System.out.println("The Match Details are :");
		for(int i=0;i<l.size();i++){
			Match m=l.get(i);
			m.displayMatch(m, i+1);
	}

}
}

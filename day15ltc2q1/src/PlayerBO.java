
	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	class PlayerBO
	{

	  public Player createPlayer(String data)
	   {
	     //fill your code;
		  String g[]=data.split(",");
		  Player p=new Player(g[0],g[1],g[2]);
		  return p;
	   }

	}

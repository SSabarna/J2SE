import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class UmpireBO
{

 public Umpire createUmpire (String data, UmpireType[] umpireTypeList)
 {
    //fill your code
	 String g[]=data.split(",");
	 int i;
	 for(i=0;i<umpireTypeList.length;i++)
	 {
		 if(g[1].equals(umpireTypeList[i].getType()))
			 break;
	 }
	 Umpire u=new Umpire(g[0],umpireTypeList[i]);
	 return u;
 }

}

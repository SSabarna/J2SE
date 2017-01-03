import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class InningsBO {
	
   public  Innings createInnings(String data) {
	
	   String inningsNumber,battingTeam;
   	
   	//String a=new String();
   	inningsNumber=data.split(",")[ 0];
   	battingTeam=data.split(",")[1] ;
   	Long inningno=Long.parseLong( inningsNumber);
    Innings inningsDetail=new Innings(inningno,battingTeam);
	return inningsDetail;

    }

}
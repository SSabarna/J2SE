import java.util.Date;
import java.text.SimpleDateFormat;


public class Match {
	void displayMatchDetails(Date matchDate) {
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
		String dt = sdf.format(matchDate);
		System.out.println("Match Date : "+dt);
	}
	void displayMatchDetails(String venue) {
		String str[] = venue.split(",");
		System.out.println("Match Venue :");
		System.out.println("Stadium : "+str[0]);
		System.out.println("City : "+str[1]);
	}
	void displayMatchDetails(String winnerTeam,long runs) {
		System.out.println("Match Outcome :");
		System.out.println(winnerTeam+" won by "+runs+" runs");
	}
}
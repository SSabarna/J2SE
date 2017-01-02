
public class PlayerBO {
	void displayAllPlayerDetails(Player playerList[])
	{
		System.out.println("Player Details");
		int i;
		for(i=0;i<playerList.length;i++)
			System.out.println(playerList[i].toString());
	}
}

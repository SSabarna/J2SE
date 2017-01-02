
public class DeliveryBO {
	void displayAllDeliveryDetails(Delivery[] deliveryList)
	{
		System.out.println("Delivery Details");
		String g[] = {"Over","Ball","Runs","Batsman","Bowler","NonStriker"};
		System.out.printf("%-20s %-20s %-20s %-20s %-20s %s",g);
		System.out.println();
		for(int i=0;i<deliveryList.length;i++)
			System.out.println(deliveryList[i].toString());
	}
	void displayBatsmanBowlerDetails(Delivery[] deliveryList, long ball,long over)
	{
		for(int i=0;i<deliveryList.length;i++)
		{
			if(deliveryList[i].getBall()==ball && deliveryList[i].getOver()==over)
			{
				System.out.println("Batsman : "+deliveryList[i].getBatsman());
				System.out.println("Bowler : "+deliveryList[i].getBowler());
			}
		}
	}

	void displayMaximumRunDetails(Delivery[] deliveryList)
	{
		long max = deliveryList[0].getRuns();
		int pos = 0;
		for(int i = 0;i<deliveryList.length;i++)
		{
			if(max<deliveryList[i].getRuns())
			{
				max = deliveryList[i].getRuns();
				pos = i;
			}
		}
		System.out.printf("Maximum Runs : %d\nOver : %d\nBall : %d",deliveryList[pos].getRuns(),deliveryList[pos].getOver(),deliveryList[pos].getBall());
	}

}

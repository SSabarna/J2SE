public class OutcomeBO {
	void displayAllOutcomeDetails(Outcome[] outcomeList) 
	{
		System.out.println("Outcome Details");
		String n[] = {"Status","Winning Team","Player Of The Match","Date"};
		System.out.printf("%-20s %-20s %-20s %s",n);
		System.out.println();
		for(int i = 0;i<outcomeList.length;i++)
		{
			System.out.println(outcomeList[i].toString());
		}
	}

	void displaySpecificOutcomeDetails(Outcome[] outcomeList, String date)
	{
		System.out.println("Outcome Details");
		String n[] = {"Status","Winning Team","Player Of The Match","Date"};
		System.out.printf("%-20s %-20s %-20s %s",n);
		System.out.println();
		for(int i = 0;i<outcomeList.length;i++)
		{
			if(outcomeList[i].toString().contains(date))
				System.out.println(outcomeList[i].toString());
		}
	}

}


	public class PlayerBO {
		void viewDetails(Player[] playerList)
		{
			
			String n[]={"Player","Country","Skill"};
			System.out.printf("%-15s %-15s %-15s",n);
			System.out.println();
			for(int i=0;i<playerList.length;i++)
			{
				System.out.println(playerList[i].toString());
			}
		}
		void printPlayerDetailsWithSkill(Player[] playerList, String skill)
		{
			String n[]={"Player","Country","Skill"};
			System.out.printf("%-15s %-15s %-15s",n);
			System.out.println();
			for(int i=0;i<playerList.length;i++)
			{
				if(playerList[i].getSkill().getSkillName().equals(skill))
				System.out.println(playerList[i].toString());
			}
		}
	}

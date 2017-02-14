
public class TeamThread extends Thread{
	Main threadMain;
	int numberOfPlayers ;
	int i=0;
	
	public TeamThread(Main threadMain, int numberOfPlayers) {
		super();
		this.threadMain = threadMain;
		this.numberOfPlayers = numberOfPlayers;
	}
	
	public void run()
	{
		if(!threadMain.isAlive())
			//threadMain.notify();
		synchronized (threadMain)
		{
			
			System.out.println("Player Thread "+i);
			i++;
			for(i=1;i<numberOfPlayers;i++)
			{
				System.out.println("Player Thread "+i);
			}
			/*try {
				threadMain.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
		}
	}

}

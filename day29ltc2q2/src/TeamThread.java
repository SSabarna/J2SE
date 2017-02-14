
public class TeamThread extends Thread{
	private Main threadMain;
	private int numberOfPlayers;
	
	
	public TeamThread(Main threadMain, int numberOfPlayers) {
		super();
		this.threadMain = threadMain;
		this.numberOfPlayers = numberOfPlayers;
	}
	public Main getThreadMain() {
		return threadMain;
	}
	public void setThreadMain(Main threadMain) {
		this.threadMain = threadMain;
	}
	public int getNumberOfPlayers() {
		return numberOfPlayers;
	}
	public void setNumberOfPlayers(int numberOfPlayers) {
		this.numberOfPlayers = numberOfPlayers;
	}
	public void run()
	{
		this.print();
	}
	synchronized void print()
	{
		for(int i=0;i<numberOfPlayers;i++)
		{
			threadMain.value[i]=i;
		}
	}
}

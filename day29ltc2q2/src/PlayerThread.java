
public class PlayerThread extends Thread {
	private Main threadMain;
	private int numberOfPlayers;
	public PlayerThread(Main threadMain, int numberOfPlayers) {
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
		for(int i=0;i<numberOfPlayers;i++)
		{
			System.out.println("Player Thread "+threadMain.value[i]);
		}
	}

}

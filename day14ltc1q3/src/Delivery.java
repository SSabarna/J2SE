
public class Delivery {
	long over;
	long ball;
	String batsman;
	String bowler;
	String nonStriker;
	
	public long getOver() {
		return over;
	}
	public void setOver(long over) {
		this.over = over;
	}
	public long getBall() {
		return ball;
	}
	public void setBall(long ball) {
		this.ball = ball;
	}
	public String getBatsman() {
		return batsman;
	}
	public void setBatsman(String batsman) {
		this.batsman = batsman;
	}
	public String getBowler() {
		return bowler;
	}
	public void setBowler(String bowler) {
		this.bowler = bowler;
	}
	public String getNonStriker() {
		return nonStriker;
	}
	public void setNonStriker(String nonStriker) {
		this.nonStriker = nonStriker;
	}
	
	public Delivery(long over, long ball, String batsman, String bowler,
			String nonStriker) {
		super();
		this.over = over;
		this.ball = ball;
		this.batsman = batsman;
		this.bowler = bowler;
		this.nonStriker = nonStriker;
	}
	
	public Delivery() {
		
	}
	
	public String toString() {
		return ("\nOver :"+over+"\nBall :"+ball+"\nBatsman :"+batsman+"\nBowler :"+bowler+"\nNonStriker :"+nonStriker);
	}
}

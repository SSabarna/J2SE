
public class ODIMatch extends Match{

/*
	public ODIMatch(int currentScore, float currentOver, int target) {
		super(currentScore, currentOver, target);
		// TODO Auto-generated constructor stub
	}
*/
	public float calculateRunrate() {
		float rr = (float) ((getTarget()-getCurrentScore())/(50.0-getCurrentOver()));
		return rr;
	}

	public int calculateBalls() {
		int b = (int) ((50 - getCurrentOver() )*6);
		return b;
	}

}



 
public class T20Match extends Match {

	/*
	public T20Match(int currentScore, float currentOver, int target) {
		super(currentScore, currentOver, target);
		// TODO Auto-generated constructor stub
	}
*/
	public float calculateRunrate() {
		float rr = (float) ((getTarget()-getCurrentScore())/(20.0-getCurrentOver()));
		return rr;
	}

	public int calculateBalls() {
		int b = (int)((20 - getCurrentOver())*6);
		return b;
	}
	
}



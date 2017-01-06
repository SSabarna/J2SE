
public class TestMatch extends Match{

	/*
	public TestMatch(int currentScore, float currentOver, int target) {
		super(currentScore, currentOver, target);
		// TODO Auto-generated constructor stub
	}
*/
	public float calculateRunrate() {
		float rr = (float) ((getTarget()-getCurrentScore())/(90.0-getCurrentOver()));
		return rr;
	}

	public int calculateBalls() {
		int b = (int) ((90 - getCurrentOver() )*6);
		return b;
	}

}



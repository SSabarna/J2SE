
public class TwoWheeler extends Vehicle{
	private boolean kickStartAvailable;

	public boolean isKickStartAvailable() {
		return kickStartAvailable;
	}

	public void setKickStartAvailable(boolean kickStartAvailable) {
		this.kickStartAvailable = kickStartAvailable;
	}

	
	public TwoWheeler(String make, String vehicleNumber, String fuelType,
			int fuelCapacity, int cc,boolean kickStartAvailable) {
		super(make, vehicleNumber, fuelType, fuelCapacity, cc);
		this.kickStartAvailable=kickStartAvailable;
		// TODO Auto-generated constructor stub
	}

	public TwoWheeler(){	
	}
	
	public void displayDetailInfo()
	{ 
		System.out.println("---Detail Information---");
		if(kickStartAvailable)
		System.out.println("Kick Start Available:YES");
	else
		System.out.println("Kick Start Available:NO");
	}
}

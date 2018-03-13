public class ParkingMeter {
	private int timeLeft = 0;
	private int maxTime;
	
	public ParkingMeter(int maxTime) {
		super();
		this.maxTime = maxTime;
	}
	
	public boolean add(int i) {
		if(i == 25 && timeLeft + 30 <= maxTime) {
			timeLeft += 30;
			return true;
		}
		else return false;
	}
	
	public void tick() {
		if(timeLeft > 0) timeLeft--;
	}
	
	public boolean isExpired() {
		return timeLeft == 0;
	}
}

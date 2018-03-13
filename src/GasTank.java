public class GasTank {
	private double amount = 0;
	private double capacity;
	
	public GasTank(double capacity) {
		super();
		this.capacity = capacity;
	}
	public void addGas(double inc) {
		amount += inc;
		if(amount>capacity) amount = capacity;
	}
	public void useGas(double inc) {
		amount -= inc;
		if(amount<0) amount = 0;
	}
	public double getGasLevel() {
		return amount;
	}
	public boolean isEmpty() {
		return amount < 0.1;
	}
	public boolean isFull() {
		return amount > capacity-0.1;
	}
	public double fillUp() {
		double c = amount;
		amount = capacity;
		return capacity - c;
	}
}

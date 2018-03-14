public class Counter {
	private int counter, counterID;
	private static int nCounters = 0;
	public Counter(int counter) {
		this.counter = counter;
		this.counterID = ++nCounters;
	}
	public int getValue() {
		return counter;
	}
	public int getCounterID() {
		return counterID;
	}
	public void increment() {
		counter++;
	}
	public void decrement() {
		counter--;
	}
}

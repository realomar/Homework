public class Value {
	private boolean modified = false;
	private int val = 0;
	
	public Value(int val) {
		this.val = val;
	}

	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
		this.modified = true;
		
	}

	public boolean wasModified() {
		return modified;
	}
}
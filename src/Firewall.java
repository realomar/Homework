public class Firewall implements CommDevice{
	private String permittedReceiver, buffer;

	public Firewall(String permittedReceiver) {
		this.permittedReceiver = permittedReceiver;
	}
	
	public void transmit(String s1, String s2) {
		this.permittedReceiver = s1;
		this.buffer = s2;
		System.out.println("Data scheduled for transmission to " + s1);
	}
	public boolean receive(String s1, String s2) {
		if(s1 == permittedReceiver) {buffer = s2; return true;}
		else {
			buffer = "";
			System.out.println("Attempted breach of firewall by " + s1);
			return false;
		}
	}
}

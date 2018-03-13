

public class CarLoan {
	
	private double price, downPay, interest;
	private int loanMonths;
	
	public CarLoan(double price, double downPay, int loanMonths, double interest) {
		this.price = price;
		this.downPay = downPay;
		this.interest = interest;
		this.loanMonths = loanMonths;
	}
	
	public double monthlyRate(){
		return (interest*(price-downPay)/12)/(1-Math.pow(1+interest/12,loanMonths));
	}
	
	public double interestPaid(){
		return (monthlyRate()*loanMonths-price+downPay);
	}
}

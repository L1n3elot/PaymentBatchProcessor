// set amt to private double type
// create Check constructor to reference amt
// create setAmount method to reference amt
// create getAmount method to return amt
package cop2251.spring25.week4.medina;

public class Check implements Payment {
	private double amt;
	
	public Check(double amt) {
		this.amt = amt;
	}

	@Override
	public void setAmount(double amt) {
		this.amt = amt;
		
	}

	@Override
	public double getAmount() {
		return amt;
	}

	

	
}

// set amt to private double type
// create IOU constructor to reference amt
// create setAmount method to reference amt
// create getAmount method to return amt
package cop2251.spring25.week4.medina;

public class IOU implements Payment{
	private double amt;
	
	public 	IOU(double amt) {
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

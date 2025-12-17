// set list variable to ArrayList as generic type T
// create add method to add payments to list
// in getMax method as T generic type
//	set high to get first element of ArrayList
//	in foreach loop
//	 use if statement to get the highest number and return the highest number
//	in getTotal
//	 set total to 0
//	 for each element in list
//	  calculate total amount and then return total
//  in getSize method get the size of the list
package cop2251.spring25.week4.medina;

import java.util.ArrayList;


public class PaymentBatchProcessor<T extends Payment> {
	private ArrayList<T> list = new ArrayList<>();
	
	public void add(T pay) {
		list.add(pay);
	}
	
	
	public T getMax() {
		T high = list.get(0);
		
		// Goes through each element to get the maximum amount
		for (T e : list) {
			if (e.getAmount() > high.getAmount()) {
				high = e;
			}
		}
		return high;
	
	}
	
	public double getTotal() {
		double total = 0;
		
		// calculates the total amount
		for (T e: list) 
			total += e.getAmount();
	
		return total;
	}

	public int getSize() {
	    return list.size();
	  }

}

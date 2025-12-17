package cop2251.spring25.week4.medina;


public class PaymentTest {
	public static void main(String[] args) {
		PaymentBatchProcessor<Check> check = new PaymentBatchProcessor<>();
		
		
		
		check.add( new Check(3.5));
		check.add( new Check(21.9));
		check.add( new Check(10));
		
		System.out.println(check.getSize());
		System.out.println(check.getMax().getAmount());
		System.out.println(check.getTotal() + "\n");
		
		
		
		PaymentBatchProcessor<IOU> iou = new PaymentBatchProcessor<>();
		
		iou.add( new IOU(5));
		iou.add( new IOU(11));
		iou.add( new IOU(10));
		iou.add( new IOU(19));
		
		System.out.println(iou.getSize());
		System.out.println(iou.getMax().getAmount());
		System.out.println(iou.getTotal());
	}
}

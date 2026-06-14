
public class AdapterDemo {
   
	public static void main(String[] args) {
       
		OldPaymentProcessor processor = new PaymentAdapter(new NewPaymentGateway());

        processor.makePayment(5000);
    }
}

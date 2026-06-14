
class PaymentAdapter implements OldPaymentProcessor {

	private NewPaymentGateway newGateway;

    public PaymentAdapter(NewPaymentGateway newGateway) {
        this.newGateway = newGateway;
    }

    @Override
    public void makePayment(double amount) {
        // The adapter chooses a default currency
        newGateway.sendPayment(amount, "PKR");
    }
}

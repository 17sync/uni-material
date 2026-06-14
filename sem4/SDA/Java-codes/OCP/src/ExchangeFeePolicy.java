
public class ExchangeFeePolicy implements FeePolicy {
   
	public double calculateFee(double baseFee) {
        
		return baseFee * 0.75;
    }
}

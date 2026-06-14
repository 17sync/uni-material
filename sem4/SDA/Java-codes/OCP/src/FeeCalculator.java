public class FeeCalculator {
    
	public double calculate(FeePolicy policy, double baseFee) {
       
		return policy.calculateFee(baseFee);
    }
}

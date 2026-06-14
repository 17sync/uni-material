
public class ScholarshipFeePolicy implements FeePolicy {
    
	public double calculateFee(double baseFee) {
       
		return baseFee * 0.5;
    }
}

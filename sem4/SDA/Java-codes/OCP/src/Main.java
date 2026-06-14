
public class Main {
    
	public static void main(String[] args) {
		
        FeeCalculator calc = new FeeCalculator();

        System.out.println("Regular Fee: " + calc.calculate(new RegularFeePolicy(), 10000));
        System.out.println("Scholarship Fee: " + calc.calculate(new ScholarshipFeePolicy(), 10000));
        System.out.println("Exchange Fee: " + calc.calculate(new ExchangeFeePolicy(), 10000));
    }
}


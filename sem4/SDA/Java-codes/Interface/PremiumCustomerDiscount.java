
class PremiumCustomerDiscount implements DiscountStrategy {
    public double applyDiscount(double price) {
        return price * 0.80; // 20% discount
    }
}
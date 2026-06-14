
class FestivalDiscount implements DiscountStrategy {
    public double applyDiscount(double price) {
        return price * 0.70; // 30% off during festivals
    }
}

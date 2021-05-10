public class AmountDiscountPolicy extends DiscountPolicy {
    private double discountAmount;


    public AmountDiscountPolicy(double discountAmount, DiscountCondition ... conditions) {
        super(conditions);
        this.discountAmount = discountAmount;
    }

    @Override
    protected double getDiscountFee(Screen screen) {
        return this.discountAmount;
    }
}

import sun.tools.jconsole.JConsole;

public class RatioDiscountPolicy extends DiscountPolicy {
    private double ratio;

    public RatioDiscountPolicy(double ratio, DiscountCondition condition) {
        super(condition);
        this.ratio = ratio;
    }

    @Override
    protected double getDiscountFee(Screen screen) {
        return screen.getFee() * this.ratio;
    }
}

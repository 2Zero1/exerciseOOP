import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

abstract public class DiscountPolicy {
    private List<DiscountCondition> conditions = new ArrayList<>();

    public DiscountPolicy(DiscountCondition ... conditions) {
        this.conditions = Arrays.asList(conditions);
    }

    public final double calculateDiscountFee(Screen screen) {
        for(DiscountCondition each: conditions) {
            if (each.isSatisfied(screen)) {
                return this.getDiscountFee(screen);
            }
        }
        return 0;
    }

    protected abstract double getDiscountFee(Screen screen);

}

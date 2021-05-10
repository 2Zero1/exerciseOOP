public class FirstSequenceDiscountCondition implements DiscountCondition {
    @Override
    public boolean isSatisfied(Screen screen) {
        return screen.sequence == 1;
    }
}

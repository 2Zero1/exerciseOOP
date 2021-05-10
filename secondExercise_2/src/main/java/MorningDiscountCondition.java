public class MorningDiscountCondition implements DiscountCondition {
    private int startTime;
    private int endTime;

    public MorningDiscountCondition(int startTime, int endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    @Override
    public boolean isSatisfied(Screen screen) {
        return screen.startTime >= 6 && screen. endTime <= 12;
}
}

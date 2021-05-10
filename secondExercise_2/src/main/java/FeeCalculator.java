public class FeeCalculator {
    public double calculateFee(Screen screen, int humanCount) {
        return screen.calculateFee() * humanCount;
    }
}

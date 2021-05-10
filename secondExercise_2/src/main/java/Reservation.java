public class Reservation {
    private final double fee;
    private int humanCount;
    private Screen screen;

    public Reservation(Screen screen, int humanCount, Double fee) {
        this.humanCount = humanCount;
        this.screen = screen;
        this.fee = fee;
    }

    public int getHumanCount() {
        return this.humanCount;
    }

    public double getFee() {
        return this.fee;
    }
}

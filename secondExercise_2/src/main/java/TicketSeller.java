public class TicketSeller {
    private FeeCalculator feeCalculator;

    public TicketSeller(FeeCalculator feeCalculator) {
        this.feeCalculator = feeCalculator;
    }

    public Reservation reserve(Screen screen, int humanCount) {
        Reservation reservation = new Reservation(screen, humanCount, feeCalculator.calculateFee(screen, humanCount));
        return reservation;
    }
}

public class TicketSeller {
    public Reservation reserve(int humanCount) {
        Reservation reservation = new Reservation(humanCount);
        return reservation;
    }
}

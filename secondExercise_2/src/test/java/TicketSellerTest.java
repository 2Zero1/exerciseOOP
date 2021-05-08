import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TicketSellerTest {
    @Test
    public void reserve() {
        TicketSeller ticketSeller = new TicketSeller();
        Reservation reservation = ticketSeller.reserve(2);

        assertEquals(reservation.getClass(), Reservation.class);
        assertEquals(reservation.getHumanCount(), 2);

    }
}
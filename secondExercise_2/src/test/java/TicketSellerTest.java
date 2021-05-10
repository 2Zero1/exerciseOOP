import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class TicketSellerTest {
    @Test
    public void reserve() {
        FeeCalculator feeCalculator = new FeeCalculator();
        TicketSeller ticketSeller = new TicketSeller(feeCalculator);
        Movie harry = new Movie(1, "harry");
        AmountDiscountPolicy amountDiscountPolicy = new AmountDiscountPolicy(2000, new MorningDiscountCondition(6,12));

        Screen harryInMorning = new Screen(1, harry, 7, 10, 10000, amountDiscountPolicy);
        Screen harryInNight = new Screen(1, harry, 13, 15, 10000, amountDiscountPolicy);
        Reservation reservation = ticketSeller.reserve(harryInMorning, 2);
        Reservation reservation2 = ticketSeller.reserve(harryInNight, 2);

        assertEquals(reservation.getClass(), Reservation.class);
        assertEquals(reservation.getHumanCount(), 2);
        assertEquals(reservation.getFee(), 16000.0,1);

        assertEquals(reservation2.getFee(), 20000.0,1);
    }
}
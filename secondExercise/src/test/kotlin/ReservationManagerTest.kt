import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions

class ReservationManagerTest {
    @Test
    fun `reserves movie ticket`() {
        val calculator = FeeCalculator()

        val reservationManager = ReservationManager(calculator)

        val harrypoter = Movie("해리포터", "판타지")

        val moringTimeDiscountCondition = MorningTimeDiscountCondition()

        val discountConditions = listOf<DiscountCondition>(moringTimeDiscountCondition)

        val amountDiscountPolicy = AmountDiscountPolicy(discountConditions)

        val harrypoterInMorning = Screen(1, harrypoter, 9, 11, 300.0, amountDiscountPolicy)

        val reservation: Reservation = reservationManager.reserve("이영한", 3, harrypoterInMorning)

        Assertions.assertEquals(reservation.personName, "이영한")
        Assertions.assertEquals(reservation.personCount, 3)
        Assertions.assertEquals(reservation.fee, 0.0)
    }
}

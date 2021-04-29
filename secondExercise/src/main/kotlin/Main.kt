fun main() {
    val calculator = FeeCalculator()

    val reservationManager = ReservationManager(calculator)

    val harrypoter = Movie("해리포터", "판타지")

    val moringTimeDiscountCondition = MorningTimeDiscountCondition()

    val discountConditions = listOf<DiscountCondition>(moringTimeDiscountCondition)

    val amountDiscountPolicy = AmountDiscountPolicy(discountConditions)
    val ratioDiscountPolicy = RatioDiscountPolicy(discountConditions)

    val harrypoterInMorning = Screen(1, harrypoter, 9, 11, 300.0, ratioDiscountPolicy)

    val reservation: Reservation = reservationManager.reserve("이영한", 3, harrypoterInMorning)

    println(reservation.fee)
}
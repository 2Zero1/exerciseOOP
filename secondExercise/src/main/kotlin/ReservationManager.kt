class ReservationManager(private val calculator: FeeCalculator) {
    fun reserve(name: String, personCount: Int, screen: Screen): Reservation {

        return Reservation(name, personCount, screen, this.calculator.calculate(screen, personCount))
    }
}
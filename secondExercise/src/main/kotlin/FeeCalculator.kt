class FeeCalculator {
    fun calculate(screen: Screen, personCount: Int): Double {
        return screen.calculateFee() * personCount
    }
}

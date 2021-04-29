class Screen(
    val sequence: Int,
    val movie: Movie,
    val startTime: Int,
    val endTime: Int,
    val fee: Double,
    val discountPolicy: DiscountPolicy
) {
    fun calculateFee(): Double {

        return this.fee - this.discountPolicy.calculateDiscountFee(this)
    }

    fun isBetweenTime(start: Int, end: Int): Boolean = this.startTime in (start + 1) until end
}

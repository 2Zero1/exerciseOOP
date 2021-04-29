abstract class DiscountPolicy(private val discountConditions: List<DiscountCondition>) {
    fun calculateDiscountFee(screen: Screen): Double {
        for(discountCondition in discountConditions) {
            if(discountCondition.isSatisfied(screen)) return getDiscountFee(screen.fee)
        }
        return 0.0
    }

    abstract fun getDiscountFee(fee: Double): Double
}

class RatioDiscountPolicy(discountCondition: List<DiscountCondition>): DiscountPolicy(discountCondition) {
    override fun getDiscountFee(fee: Double): Double {
        return fee * 0.1
    }
}

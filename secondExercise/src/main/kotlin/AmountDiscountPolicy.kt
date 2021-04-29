class AmountDiscountPolicy(discountCondition: List<DiscountCondition>) :DiscountPolicy(discountCondition){
    override fun getDiscountFee(fee: Double): Double {
        return 300.0
    }
}

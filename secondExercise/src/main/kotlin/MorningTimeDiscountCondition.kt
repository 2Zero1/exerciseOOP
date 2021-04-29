class MorningTimeDiscountCondition : DiscountCondition {
    override fun isSatisfied(screen: Screen): Boolean = screen.isBetweenTime(6,12)
}

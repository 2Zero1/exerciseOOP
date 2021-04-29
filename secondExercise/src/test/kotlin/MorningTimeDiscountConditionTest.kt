import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions

class MorningTimeDiscountConditionTest {
    @Test
    internal fun `calculateDiscountFee`() {
        val moringTimeDiscountCondition = MorningTimeDiscountCondition()

        val discountConditions = listOf<DiscountCondition>(moringTimeDiscountCondition)

        val amountDiscountPolicy = AmountDiscountPolicy(discountConditions)

        val harrypoter = Movie("해리포터", "판타지")
        val screen = Screen(3, harrypoter, 9, 11, 300.0, amountDiscountPolicy)

        println(amountDiscountPolicy.calculateDiscountFee(screen))
        Assertions.assertEquals(amountDiscountPolicy.calculateDiscountFee(screen), 300.0)
    }
}
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions

class AmountDiscountPolicyTest {
    @Test
    internal fun `calculateDiscountFee`() {
        val moringTimeDiscountCondition = MorningTimeDiscountCondition()

        val discountConditions = listOf<DiscountCondition>(moringTimeDiscountCondition)

        val amountDiscountPolicy = AmountDiscountPolicy(discountConditions)

        val harrypoter = Movie("해리포터", "판타지")
        val screen = Screen(1, harrypoter, 9, 11, 300.0, amountDiscountPolicy)

        Assertions.assertEquals(amountDiscountPolicy.calculateDiscountFee(screen), 300.0)
    }
}
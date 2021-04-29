import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions

class RatioDiscountPolicyTest {
    @Test
    internal fun `calculateDiscountFee`() {
        val moringTimeDiscountCondition = MorningTimeDiscountCondition()

        val discountConditions = listOf<DiscountCondition>(moringTimeDiscountCondition)

        val thirdSequencePolicy = RatioDiscountPolicy(discountConditions)

        val harrypoter = Movie("해리포터", "판타지")
        val screen = Screen(3, harrypoter, 9, 11, 300.0, thirdSequencePolicy)

        Assertions.assertEquals(thirdSequencePolicy.calculateDiscountFee(screen), 30.0)
    }
}
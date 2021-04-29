import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions;

class ScreenTest {
    @Test
    fun `calculate fee applied first sequence policy`() {
        val harrypoter = Movie("해리포터", "판타지")
        val moringTimeDiscountCondition = MorningTimeDiscountCondition()

        val discountConditions = listOf<DiscountCondition>(moringTimeDiscountCondition)

        val firstSequencePolicy = AmountDiscountPolicy(discountConditions)
        val screen = Screen(1, harrypoter, 9, 11, 300.0, firstSequencePolicy)

        Assertions.assertEquals(screen.calculateFee(), 0.0)
    }

    @Test
    fun `calculate fee not applied first sequence policy`() {
        val harrypoter = Movie("해리포터", "판타지")
        val moringTimeDiscountCondition = MorningTimeDiscountCondition()

        val discountConditions = listOf<DiscountCondition>(moringTimeDiscountCondition)

        val firstSequencePolicy = AmountDiscountPolicy(discountConditions)
        val screen = Screen(2, harrypoter, 9, 11, 300.0, firstSequencePolicy)

        Assertions.assertEquals(screen.calculateFee(), 300.0)
    }

    @Test
    fun `calculate fee applied third sequence policy`() {
        val harrypoter = Movie("해리포터", "판타지")
        val moringTimeDiscountCondition = MorningTimeDiscountCondition()

        val discountConditions = listOf<DiscountCondition>(moringTimeDiscountCondition)

        val thirdSequencePolicy = RatioDiscountPolicy(discountConditions)
        val screen = Screen(3, harrypoter, 9, 11, 300.0, thirdSequencePolicy)

        Assertions.assertEquals(screen.calculateFee(), 270.0)
    }

    @Test
    fun `isBetweenTime`() {
        val harrypoter = Movie("해리포터", "판타지")
        val moringTimeDiscountCondition = MorningTimeDiscountCondition()

        val discountConditions = listOf<DiscountCondition>(moringTimeDiscountCondition)

        val thirdSequencePolicy = RatioDiscountPolicy(discountConditions)
        val screen = Screen(3, harrypoter, 9, 11, 300.0, thirdSequencePolicy)

        Assertions.assertEquals(screen.isBetweenTime(6,12), true)
    }

}
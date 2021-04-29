import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions;

class FeeCalculatorTest {
    @Test
    internal fun `calculate fee`() {
        val feeCalculator = FeeCalculator()

        val harrypoter = Movie("해리포터", "판타지")

        val moringTimeDiscountCondition = MorningTimeDiscountCondition()

        val discountConditions = listOf<DiscountCondition>(moringTimeDiscountCondition)

        val firstSequencePolicy = AmountDiscountPolicy(discountConditions)

        val harrypoterInMorning = Screen(1, harrypoter, 9, 11, 300.0, firstSequencePolicy)

        val totalFee = feeCalculator.calculate(harrypoterInMorning, 3)

        Assertions.assertEquals(totalFee, 0.0)
    }
}

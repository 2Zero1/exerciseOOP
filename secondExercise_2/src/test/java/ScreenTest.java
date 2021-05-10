import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ScreenTest {
    @Test
    public void calculateDiscountFeeWithAmountDiscountPolicy() {
        Movie harry = new Movie(1, "harry");
        AmountDiscountPolicy amountDiscountPolicy = new AmountDiscountPolicy(2000, new FirstSequenceDiscountCondition());
        Screen harryInMorning = new Screen(1, harry, 6, 12, 10000, amountDiscountPolicy);

        assertEquals(harryInMorning.calculateFee(), 8000.0, 1);
    }

    @Test
    public void calculateDiscountFeeWithRatioDiscountPolicy() {
        Movie harry = new Movie(1, "harry");
        RatioDiscountPolicy ratioDiscountPolicy = new RatioDiscountPolicy(0.2, new FirstSequenceDiscountCondition());
        Screen harryInMorning = new Screen(1, harry, 6, 12, 10000, ratioDiscountPolicy);

        assertEquals(harryInMorning.calculateFee(), 8000.0, 1);
    }
}
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FeeCalculatorTest {

    @Test
    public void calculateFee() {
        FeeCalculator feeCalculator = new FeeCalculator();
        Movie harry = new Movie(1, "harry");
        AmountDiscountPolicy amountDiscountPolicy = new AmountDiscountPolicy(2000, new FirstSequenceDiscountCondition());

        Screen harryInMorning = new Screen(1, harry, 6, 12, 10000, amountDiscountPolicy);

        assertEquals(feeCalculator.calculateFee(harryInMorning, 2), 16000.0, 1);
    }
}

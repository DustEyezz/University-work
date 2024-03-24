package pl.pjatk.test;

import org.junit.Assert;
import org.junit.Test;
import pl.pjatk.unit_tests.Calculator;
import pl.pjatk.unit_tests.LargeNumExcept;

public class CalculatorTest {
    @Test
    public void powerOfTwo() { Assert.assertEquals(32 , Calculator.power(2, 5));}

    @Test
    public void powerOfFour() { Assert.assertEquals(16, Calculator.power(4, 2));}

    @Test
    public void divideByZero() { Assert.assertFalse(Calculator.dividable(4, 0));}

    @Test
    public void divideFourByTwo() { Assert.assertTrue(Calculator.dividable(4, 2));}

    @Test
    public void NWDOfZero() { Assert.assertEquals( 0, Calculator.NWD(4, 0));}

    @Test
    public void NWDOfFourAndTwo() { Assert.assertEquals(2,Calculator.NWD(4, 2) );}

    Calculator cal = new Calculator();

    @Test
    public void multiplyFourAndThree() throws LargeNumExcept { Assert.assertEquals(12,cal.multiply(3,4) );}

    @Test
    public void multiplyNegativeFourAndThree() throws LargeNumExcept { Assert.assertEquals(-12,cal.multiply(3,-4) );}

    @Test
    public void multiplyFourAndNegativeThree() throws LargeNumExcept { Assert.assertEquals(-12,cal.multiply(-3,4) );}

    @Test
    public void multiplyNegativeFourAndNegativeThree() throws LargeNumExcept { Assert.assertEquals(12,cal.multiply(-3,-4) );}

    @Test(expected = LargeNumExcept.class)
    public void whenExceptionThrown_thenExpectationSatisfied() throws LargeNumExcept {
        cal.multiply(5000000, 3000);
    }
}

package pl.pjatk.test;

import org.junit.Assert;
import org.junit.Test;
import pl.pjatk.unit_tests.PrimeNumber;

public class PrimeNumberTest {
    @Test
    public void twoIsPrimeNumber(){
        Assert.assertTrue(PrimeNumber.isPrimeNumber(2));
    }

    @Test
    public void fourIsNotPrimeNumber(){
        Assert.assertTrue(PrimeNumber.isPrimeNumber(4));
    }
}

package pl.pjatk.tdd.test.strings;

import org.junit.Assert;
import org.junit.Test;
import pl.pjatk.tdd.strings.StringUtils;

public class StringUtilsTest {
    @Test
    public void digitSumShouldBeTwelve() {
        Assert.assertEquals(12, StringUtils.digitSum("57"));
    }

    @Test
    public void ExceptionForNonNumbers() throws NumberFormatException {
        StringUtils.digitSum("Hello");
    }

    @Test
    public void palindromeShouldBeTrue() {
        Assert.assertTrue(StringUtils.palindromeCheck("ala"));
    }

    @Test
    public void palindromeShouldBeFalse() {
        Assert.assertFalse(StringUtils.palindromeCheck("alak"));
    }
}

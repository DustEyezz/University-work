package pl.pjatk.test;

import org.junit.Assert;
import org.junit.Test;

import pl.pjatk.unit_tests.StringUtils;

public class StringUtilsTest {
    @Test
    public void UpperCaseAla() { Assert.assertEquals("ALA MA KOTA" , StringUtils.toUpperCase("ala ma kota"));}
    @Test
    public void UpperCaseDomek() { Assert.assertEquals("DOMEK123" , StringUtils.toUpperCase("domek123"));}
    @Test
    public void reverseAla() { Assert.assertEquals("atok am ala" , StringUtils.reverseString("ala ma kota"));}
    @Test
    public void reverseNumbers() { Assert.assertEquals("123" , StringUtils.reverseString("321"));}
    @Test
    public void multiplyNumbers() { Assert.assertEquals("123123123" , StringUtils.multiplyString("123", 3));}
    @Test
    public void multiplyTest() { Assert.assertEquals("test test test " , StringUtils.multiplyString("test ", 3));}
    @Test
    public void removeSmallAla() { Assert.assertEquals("A" , StringUtils.removeSmallChars("Ala"));}
    @Test
    public void removeSmallNumbers() { Assert.assertEquals("123" , StringUtils.removeSmallChars("123"));}
    @Test
    public void removeBigAla() { Assert.assertEquals("la" , StringUtils.removeBigChars("Ala"));}
    @Test
    public void removeBigNumbers() { Assert.assertEquals("123" , StringUtils.removeBigChars("123"));}
    @Test
    public void removeAllAla() { Assert.assertEquals("Ala" , StringUtils.removeAllButLetters("!~~Ala123"));}
    @Test
    public void removeAllTest() { Assert.assertEquals("Test" , StringUtils.removeAllButLetters("123Test!"));}
}

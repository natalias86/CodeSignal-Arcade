package codesignal.darkWilderness;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LongestDigitsPrefixTest {
    public LongestDigitsPrefix longestDigitsPrefix;

    @Before
    public void setUp() {
        longestDigitsPrefix= new LongestDigitsPrefix();
    }

    @Test
    public void check() {
        String inputString ="123aa1";
        String expectedResult = "123";
        Assert.assertEquals(longestDigitsPrefix.longestDigitsPrefix(inputString), expectedResult);
    }
    @Test
    public void check2() {
        String inputString ="0123456789";
        String expectedResult = "0123456789";
        Assert.assertEquals(longestDigitsPrefix.longestDigitsPrefix(inputString), expectedResult);
    }
    @Test
    public void check3() {
        String inputString ="  3) always check for whitespaces";
        String expectedResult = "";
        Assert.assertEquals(longestDigitsPrefix.longestDigitsPrefix(inputString), expectedResult);
    }
    @Test
    public void check4() {
        String inputString ="12abc34";
        String expectedResult = "12";
        Assert.assertEquals(longestDigitsPrefix.longestDigitsPrefix(inputString), expectedResult);
    }
    @Test
    public void check5() {
        String inputString ="the output is 42";
        String expectedResult = "";
        Assert.assertEquals(longestDigitsPrefix.longestDigitsPrefix(inputString), expectedResult);
    }
    @Test
    public void check6() {
        String inputString ="aaaaaaa";
        String expectedResult = "";
        Assert.assertEquals(longestDigitsPrefix.longestDigitsPrefix(inputString), expectedResult);
    }
}

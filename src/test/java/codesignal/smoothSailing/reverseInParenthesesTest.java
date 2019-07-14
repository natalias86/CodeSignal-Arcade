package codesignal.smoothSailing;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class reverseInParenthesesTest {
    public ReverseInParentheses reverseInParenthesesObj;

    @Before
    public void setUp() {
        reverseInParenthesesObj = new ReverseInParentheses();
    }

    @Test
    public void check() {
        String inputString = "(bar)";
        String expectedResult = "rab";
        Assert.assertEquals(reverseInParenthesesObj.reverseInParentheses(inputString), expectedResult);
    }
    @Test
    public void check2() {
        String inputString = "foo(bar)baz";
        String expectedResult = "foorabbaz";
        Assert.assertEquals(reverseInParenthesesObj.reverseInParentheses(inputString), expectedResult);
    }
    @Test
    public void check3() {
        String inputString = "foo(bar)baz(blim)";
        String expectedResult = "foorabbazmilb";
        Assert.assertEquals(reverseInParenthesesObj.reverseInParentheses(inputString), expectedResult);
    }
    @Test
    public void check4() {
        String inputString = "foo(bar(baz))blim";
        String expectedResult = "foobazrabblim";
        Assert.assertEquals(reverseInParenthesesObj.reverseInParentheses(inputString), expectedResult);
    }
    @Test
    public void check5() {
        String inputString = "";
        String expectedResult = "";
        Assert.assertEquals(reverseInParenthesesObj.reverseInParentheses(inputString), expectedResult);
    }
    @Test
    public void check6() {
        String inputString = "()";
        String expectedResult = "";
        Assert.assertEquals(reverseInParenthesesObj.reverseInParentheses(inputString), expectedResult);
    }
    @Test
    public void check7() {
        String inputString = "(abc)d(efg)";
        String expectedResult = "cbadgfe";
        Assert.assertEquals(reverseInParenthesesObj.reverseInParentheses(inputString), expectedResult);
    }
}

package codesignal.exploringTheWater;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PalindromeRearrangingTest {

    public PalindromeRearranging palindromeRearranging;

    @Before
    public void setUp() {
        palindromeRearranging = new PalindromeRearranging();
    }

    @Test
    public void check() {
        String inputString = "aabb";
        Assert.assertTrue(palindromeRearranging.palindromeRearranging(inputString));
    }
    @Test
    public void check2() {
        String inputString = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaabc";
        Assert.assertFalse(palindromeRearranging.palindromeRearranging(inputString));
    }
    @Test
    public void check3() {
        String inputString = "abbcabb";
        Assert.assertTrue(palindromeRearranging.palindromeRearranging(inputString));
    }
    @Test
    public void check4() {
        String inputString = "zyyzzzzz";
        Assert.assertTrue(palindromeRearranging.palindromeRearranging(inputString));
    }
    @Test
    public void check6() {
        String inputString = "zaa";
        Assert.assertTrue(palindromeRearranging.palindromeRearranging(inputString));
    }
    @Test
    public void check7() {
        String inputString = "abca";
        Assert.assertFalse(palindromeRearranging.palindromeRearranging(inputString));
    }
    @Test
    public void check8() {
        String inputString = "abcad";
        Assert.assertFalse(palindromeRearranging.palindromeRearranging(inputString));
    }
    @Test
    public void check9() {
        String inputString = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaabbbccccaaaaaaaaaaaaa";
        Assert.assertFalse(palindromeRearranging.palindromeRearranging(inputString));
    }
    @Test
    public void check10() {
        String inputString = "abdhuierf";
        Assert.assertFalse(palindromeRearranging.palindromeRearranging(inputString));
    }
}

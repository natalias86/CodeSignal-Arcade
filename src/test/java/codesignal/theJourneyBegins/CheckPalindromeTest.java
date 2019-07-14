package codesignal.theJourneyBegins;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CheckPalindromeTest {


    public CheckPalindrome checkPalindromeObj;

    @Before
    public void setUp() {
        checkPalindromeObj = new CheckPalindrome();
    }
    @Test
    public void  check(){
        String inputString="aabaa";
        Assert.assertTrue(checkPalindromeObj.checkPalindrome(inputString));
    }
    @Test
    public void  check2(){
        String inputString="abac";
        Assert.assertFalse(checkPalindromeObj.checkPalindrome(inputString));
    }
    @Test
    public void  check3(){
        String inputString="a";
        Assert.assertTrue(checkPalindromeObj.checkPalindrome(inputString));
    }
    @Test
    public void  check4(){
        String inputString="az";
        Assert.assertFalse(checkPalindromeObj.checkPalindrome(inputString));
    }
    @Test
    public void  check5(){
        String inputString="abacaba";
        Assert.assertTrue(checkPalindromeObj.checkPalindrome(inputString));
    }
}

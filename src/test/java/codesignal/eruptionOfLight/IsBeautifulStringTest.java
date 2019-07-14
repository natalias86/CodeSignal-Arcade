package codesignal.eruptionOfLight;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IsBeautifulStringTest {

    public IsBeautifulString isBeautifulString;

    @Before
    public void setUp() {
        isBeautifulString = new IsBeautifulString();
    }

    @Test
    public void check() {
        String inputString = "bbbaacdafe";
        Assert.assertTrue(isBeautifulString.isBeautifulString(inputString));
    }

    @Test
    public void check2() {
        String inputString = "aabbb";
        Assert.assertFalse(isBeautifulString.isBeautifulString(inputString));
    }

    @Test
    public void check3() {
        String inputString = "bbc";
        Assert.assertFalse(isBeautifulString.isBeautifulString(inputString));
    }

    @Test
    public void check4() {
        String inputString = "bbbaa";
        Assert.assertFalse(isBeautifulString.isBeautifulString(inputString));
    }

    @Test
    public void check5() {
        String inputString = "abcdefghijklmnopqrstuvwxyzz";
        Assert.assertFalse(isBeautifulString.isBeautifulString(inputString));
    }

    @Test
    public void check6() {
        String inputString = "abcdefghijklmnopqrstuvwxyz";
        Assert.assertTrue(isBeautifulString.isBeautifulString(inputString));
    }

    @Test
    public void check7() {
        String inputString = "abcdefghijklmnopqrstuvwxyzqwertuiopasdfghjklxcvbnm";
        Assert.assertTrue(isBeautifulString.isBeautifulString(inputString));
    }

    @Test
    public void check8() {
        String inputString = "fyudhrygiuhdfeis";
        Assert.assertFalse(isBeautifulString.isBeautifulString(inputString));
    }

    @Test
    public void check9() {
        String inputString = "zaa";
        Assert.assertFalse(isBeautifulString.isBeautifulString(inputString));
    }

    @Test
    public void check10() {
        String inputString = "zyy";
        Assert.assertFalse(isBeautifulString.isBeautifulString(inputString));
    }
}

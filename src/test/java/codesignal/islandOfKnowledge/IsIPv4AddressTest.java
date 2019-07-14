package codesignal.islandOfKnowledge;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IsIPv4AddressTest {
    public IsIPv4Address isIPv4Address;

    @Before
    public void setUp() {
       isIPv4Address = new IsIPv4Address();
    }

    @Test
    public void check() {
        String inputString = "172.16.254.1";
        Assert.assertTrue(isIPv4Address.isIPv4Address(inputString));
    }
    @Test
    public void check2() {
        String inputString = "172.316.254.1";
        Assert.assertFalse(isIPv4Address.isIPv4Address(inputString));
    }
    @Test
    public void check3() {
        String inputString = ".254.255.0";
        Assert.assertFalse(isIPv4Address.isIPv4Address(inputString));
    }
    @Test
    public void check4() {
        String inputString = "1.1.1.1a";
        Assert.assertFalse(isIPv4Address.isIPv4Address(inputString));
    }
    @Test
    public void check5() {
        String inputString = "1";
        Assert.assertFalse(isIPv4Address.isIPv4Address(inputString));
    }
    @Test
    public void check6() {
        String inputString = "0.254.255.0";
        Assert.assertTrue(isIPv4Address.isIPv4Address(inputString));
    }
    @Test
    public void check7() {
        String inputString = "1.23.256.255.";
        Assert.assertFalse(isIPv4Address.isIPv4Address(inputString));
    }
    @Test
    public void check8() {
        String inputString = "1.23.256..";
        Assert.assertFalse(isIPv4Address.isIPv4Address(inputString));
    }
    @Test
    public void check9() {
        String inputString = "0..1.0";
        Assert.assertFalse(isIPv4Address.isIPv4Address(inputString));
    }
    @Test
    public void check10() {
        String inputString = "35..36.9.9.0";
        Assert.assertFalse(isIPv4Address.isIPv4Address(inputString));
    }
    @Test
    public void check11() {
        String inputString = "1.1.1.1.1";
        Assert.assertFalse(isIPv4Address.isIPv4Address(inputString));
    }
    @Test
    public void check12() {
        String inputString = "1.256.1.1";
        Assert.assertFalse(isIPv4Address.isIPv4Address(inputString));
    }
    @Test
    public void check13() {
        String inputString = "a0.1.1.1";
        Assert.assertFalse(isIPv4Address.isIPv4Address(inputString));
    }
    @Test
    public void check14() {
        String inputString = "0.1.1.256";
        Assert.assertFalse(isIPv4Address.isIPv4Address(inputString));
    }
    @Test
    public void check15() {
        String inputString = "129380129831213981.255.255.255";
        Assert.assertFalse(isIPv4Address.isIPv4Address(inputString));
    }
    @Test
    public void check16() {
        String inputString = "255.255.255.255abcdekjhf";
        Assert.assertFalse(isIPv4Address.isIPv4Address(inputString));
    }
    @Test
    public void check17() {
        String inputString = "7283728";
        Assert.assertFalse(isIPv4Address.isIPv4Address(inputString));
    }
    @Test
    public void check18() {
        String inputString = "0..1.0.0";
        Assert.assertFalse(isIPv4Address.isIPv4Address(inputString));
    }
}

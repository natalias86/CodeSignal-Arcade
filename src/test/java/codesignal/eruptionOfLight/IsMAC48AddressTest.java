package codesignal.eruptionOfLight;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IsMAC48AddressTest {

    public IsMAC48Address isMAC48Address;

    @Before
    public void setUp() {
        isMAC48Address = new IsMAC48Address();
    }
    @Test
    public void  check(){
        String inputString= "00-1B-63-84-45-E6";
        Assert.assertTrue(isMAC48Address.isMAC48Address(inputString));
    }
    @Test
    public void  check2(){
        String inputString= "Z1-1B-63-84-45-E6";
        Assert.assertFalse(isMAC48Address.isMAC48Address(inputString));
    }
    @Test
    public void  check3(){
        String inputString= "not a MAC-48 address";
        Assert.assertFalse(isMAC48Address.isMAC48Address(inputString));
    }
    @Test
    public void  check4(){
        String inputString= "FF-FF-FF-FF-FF-FF";
        Assert.assertTrue(isMAC48Address.isMAC48Address(inputString));
    }
    @Test
    public void  check5(){
        String inputString= "00-00-00-00-00-00";
        Assert.assertTrue(isMAC48Address.isMAC48Address(inputString));
    }
    @Test
    public void  check6(){
        String inputString= "G0-00-00-00-00-00";
        Assert.assertFalse(isMAC48Address.isMAC48Address(inputString));
    }
    @Test
    public void  check7(){
        String inputString= "02-03-04-05-06-07-";
        Assert.assertFalse(isMAC48Address.isMAC48Address(inputString));
    }
    @Test
    public void  check8(){
        String inputString= "12-34-56-78-9A-BC";
        Assert.assertTrue(isMAC48Address.isMAC48Address(inputString));
    }
    @Test
    public void  check9(){
        String inputString= "FF-FF-AB-CD-EA-BC";
        Assert.assertTrue(isMAC48Address.isMAC48Address(inputString));
    }
    @Test
    public void  check10(){
        String inputString= "12-34-56-78-9A-BG";
        Assert.assertFalse(isMAC48Address.isMAC48Address(inputString));
    }
}

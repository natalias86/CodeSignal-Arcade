package codesignal.rainbowOfClarity;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IsDigitTest {
    public IsDigit isDigit;

    @Before
    public void setUp() {
        isDigit = new IsDigit();
    }
    @Test
    public void  check(){
        char symbol = '0';
        Assert.assertTrue(isDigit.isDigit(symbol));
    }
    @Test
    public void  check2(){
        char symbol = '-';
        Assert.assertFalse(isDigit.isDigit(symbol));
    }
    @Test
    public void  check3(){
        char symbol = '0';
        Assert.assertTrue(isDigit.isDigit(symbol));
    }
    @Test
    public void  check4(){
        char symbol = '1';
        Assert.assertTrue(isDigit.isDigit(symbol));
    }
    @Test
    public void  check5(){
        char symbol = '2';
        Assert.assertTrue(isDigit.isDigit(symbol));
    }
    @Test
    public void  check6(){
        char symbol = '!';
        Assert.assertFalse(isDigit.isDigit(symbol));
    }
    @Test
    public void  check7(){
        char symbol = '@';
        Assert.assertFalse(isDigit.isDigit(symbol));
    }
    @Test
    public void  check8(){
        char symbol = '+';
        Assert.assertFalse(isDigit.isDigit(symbol));
    }
    @Test
    public void  check9(){
        char symbol = '6';
        Assert.assertTrue(isDigit.isDigit(symbol));
    }
    @Test
    public void  check10(){
        char symbol = '(';
        Assert.assertFalse(isDigit.isDigit(symbol));
    }
    @Test
    public void  check11(){
        char symbol = ')';
        Assert.assertFalse(isDigit.isDigit(symbol));
    }
}

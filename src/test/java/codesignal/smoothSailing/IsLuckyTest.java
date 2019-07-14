package codesignal.smoothSailing;

import codesignal.edgeOfTheOcean.ShapeArea;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IsLuckyTest {
    public IsLucky isLuckyObj;

    @Before
    public void setUp() {
        isLuckyObj = new IsLucky();
    }

    @Test
    public void  check(){
        int n = 1230;
        Assert.assertTrue(isLuckyObj.isLucky(n));
    }
    @Test
    public void  check2(){
        int n = 239017;
        Assert.assertFalse(isLuckyObj.isLucky(n));
    }
    @Test
    public void  check3(){
        int n = 134008;
        Assert.assertTrue(isLuckyObj.isLucky(n));
    }
    @Test
    public void  check4(){
        int n = 10;
        Assert.assertFalse(isLuckyObj.isLucky(n));
    }
    @Test
    public void  check5(){
        int n = 11;
       Assert.assertTrue(isLuckyObj.isLucky(n));
    }
    @Test
    public void  check6(){
        int n = 1010;
        Assert.assertTrue(isLuckyObj.isLucky(n));
    }
    @Test
    public void  check7(){
        int n = 261534;
        Assert.assertFalse(isLuckyObj.isLucky(n));
    }
}

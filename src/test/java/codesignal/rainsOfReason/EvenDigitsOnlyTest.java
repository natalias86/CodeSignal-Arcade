package codesignal.rainsOfReason;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EvenDigitsOnlyTest {
    public EvenDigitsOnly evenDigitsOnly;

    @Before
    public void setUp() {
        evenDigitsOnly = new EvenDigitsOnly();
    }
    @Test
    public void check(){
        int n = 248622;
        Assert.assertTrue(evenDigitsOnly.evenDigitsOnly(n));
    }
    @Test
    public void check2(){
        int n = 642386;
        Assert.assertFalse(evenDigitsOnly.evenDigitsOnly(n));
    }
    @Test
    public void check3(){
        int n = 248842;
        Assert.assertTrue(evenDigitsOnly.evenDigitsOnly(n));
    }
    @Test
    public void check4(){
        int n = 1;
        Assert.assertFalse(evenDigitsOnly.evenDigitsOnly(n));
    }
    @Test
    public void check5(){
        int n = 8;
        Assert.assertTrue(evenDigitsOnly.evenDigitsOnly(n));
    }
    @Test
    public void check6(){
        int n = 2462487;
        Assert.assertFalse(evenDigitsOnly.evenDigitsOnly(n));
    }
    @Test
    public void check7(){
        int n = 468402800;
        Assert.assertTrue(evenDigitsOnly.evenDigitsOnly(n));
    }
    @Test
    public void check8(){
        int n = 2468428;
        Assert.assertTrue(evenDigitsOnly.evenDigitsOnly(n));
    }
    @Test
    public void check9(){
        int n = 5468428;
        Assert.assertFalse(evenDigitsOnly.evenDigitsOnly(n));
    }
    @Test
    public void check10(){
        int n = 7468428;
        Assert.assertFalse(evenDigitsOnly.evenDigitsOnly(n));
    }
}

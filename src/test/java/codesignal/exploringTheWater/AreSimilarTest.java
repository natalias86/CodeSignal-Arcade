package codesignal.exploringTheWater;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AreSimilarTest {

    public AreSimilar areSimilar;

    @Before
    public void setUp() {
        areSimilar= new AreSimilar();
    }
    @Test
    public void  check(){
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};

        Assert.assertTrue(areSimilar.areSimilar(a,b));
    }
    @Test
    public void  check2(){
        int[] a = {1, 2, 3};
        int[] b = {2, 1, 3};

        Assert.assertTrue(areSimilar.areSimilar(a,b));
    }
    @Test
    public void  check3(){
        int[] a = {1, 2, 2};
        int[] b = {2, 1, 1};

        Assert.assertFalse(areSimilar.areSimilar(a,b));
    }
    @Test
    public void  check4(){
        int[] a = {1, 1, 4};
        int[] b = {1, 2, 3};

        Assert.assertFalse(areSimilar.areSimilar(a,b));
    }
    @Test
    public void  check5(){
        int[] a = {1, 2, 3};
        int[] b = {1, 10, 2};

        Assert.assertFalse(areSimilar.areSimilar(a,b));
    }
    @Test
    public void  check6(){
        int[] a = {2, 3, 1};
        int[] b = {1, 3, 2};

        Assert.assertTrue(areSimilar.areSimilar(a,b));
    }
    @Test
    public void  check7(){
        int[] a = {2, 3, 9};
        int[] b = {10, 3, 2};

        Assert.assertFalse(areSimilar.areSimilar(a,b));
    }

    @Test
    public void  check8(){
        int[] a = {4, 6, 3};
        int[] b = {3, 4, 6};

        Assert.assertFalse(areSimilar.areSimilar(a,b));
    }
    @Test
    public void  check9(){
        int[] a = {832, 998, 148, 570, 533, 561, 894, 147, 455, 279};
        int[] b = {832, 998, 148, 570, 533, 561, 455, 147, 894, 279};

        Assert.assertTrue(areSimilar.areSimilar(a,b));
    }
    @Test
    public void  check10(){
        int[] a = {832, 998, 148, 570, 533, 561, 894, 147, 455, 279};
        int[] b = {832, 570, 148, 998, 533, 561, 455, 147, 894, 279};

        Assert.assertFalse(areSimilar.areSimilar(a,b));
    }
}

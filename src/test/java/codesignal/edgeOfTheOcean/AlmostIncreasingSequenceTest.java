package codesignal.edgeOfTheOcean;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AlmostIncreasingSequenceTest {

    public AlmostIncreasingSequence almostIncreasingSequenceObj;

    @Before
    public void setUp() {
        almostIncreasingSequenceObj = new AlmostIncreasingSequence();
    }
    @Test
    public void  check(){
        int[] sequence ={1, 3, 2, 1};
        Assert.assertFalse(almostIncreasingSequenceObj.almostIncreasingSequence(sequence));
    }
    @Test
    public void  check2(){
        int[] sequence ={1, 3, 2};
        Assert.assertTrue(almostIncreasingSequenceObj.almostIncreasingSequence(sequence));
    }
    @Test
    public void  check3(){
        int[] sequence ={1, 2, 1, 2};
        Assert.assertFalse(almostIncreasingSequenceObj.almostIncreasingSequence(sequence));
    }
    @Test
    public void  check4(){
        int[] sequence ={3, 6, 5, 8, 10, 20, 15};
        Assert.assertFalse(almostIncreasingSequenceObj.almostIncreasingSequence(sequence));
    }
    @Test
    public void  check5(){
        int[] sequence ={1, 1, 2, 3, 4, 4};
        Assert.assertFalse(almostIncreasingSequenceObj.almostIncreasingSequence(sequence));
    }
    @Test
    public void  check6(){
        int[] sequence ={1, 4, 10, 4, 2};
        Assert.assertFalse(almostIncreasingSequenceObj.almostIncreasingSequence(sequence));
    }
    @Test
    public void  check7(){
        int[] sequence ={10, 1, 2, 3, 4, 5};
        Assert.assertTrue(almostIncreasingSequenceObj.almostIncreasingSequence(sequence));
    }
    @Test
    public void  check8(){
        int[] sequence ={1, 1, 1, 2, 3};
        Assert.assertFalse(almostIncreasingSequenceObj.almostIncreasingSequence(sequence));
    }
    @Test
    public void  check9(){
        int[] sequence ={0, -2, 5, 6};
        Assert.assertTrue(almostIncreasingSequenceObj.almostIncreasingSequence(sequence));
    }
    @Test
    public void  check10(){
        int[] sequence ={1, 2, 3, 4, 5, 3, 5, 6};
        Assert.assertFalse(almostIncreasingSequenceObj.almostIncreasingSequence(sequence));
    }
    @Test
    public void  check11(){
        int[] sequence ={40, 50, 60, 10, 20, 30};
        Assert.assertFalse(almostIncreasingSequenceObj.almostIncreasingSequence(sequence));
    }
    @Test
    public void  check12(){
        int[] sequence ={1, 1};
        Assert.assertTrue(almostIncreasingSequenceObj.almostIncreasingSequence(sequence));
    }
    @Test
    public void  check13(){
        int[] sequence ={1, 2, 5, 5, 5};
        Assert.assertFalse(almostIncreasingSequenceObj.almostIncreasingSequence(sequence));
    }
}

package codesignal.islandOfKnowledge;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ArrayMaximalAdjacentDifferenceTest {

    public ArrayMaximalAdjacentDifference arrayMaximalAdjacentDifference;

    @Before
    public void setUp() {
        arrayMaximalAdjacentDifference = new ArrayMaximalAdjacentDifference();
    }
    @Test
    public void  check(){
        int[] inputArray = {2, 4, 1, 0};
        int expectedResult= 3;
        Assert.assertEquals(arrayMaximalAdjacentDifference.arrayMaximalAdjacentDifference(inputArray),expectedResult);
    }
    @Test
    public void  check2(){
        int[] inputArray = {1,1,1,1};
        int expectedResult= 0;
        Assert.assertEquals(arrayMaximalAdjacentDifference.arrayMaximalAdjacentDifference(inputArray),expectedResult);
    }
    @Test
    public void  check3(){
        int[] inputArray = {-1, 4, 10, 3, -2};
        int expectedResult= 7;
        Assert.assertEquals(arrayMaximalAdjacentDifference.arrayMaximalAdjacentDifference(inputArray),expectedResult);
    }
    @Test
    public void  check4(){
        int[] inputArray = {10, 11, 13};
        int expectedResult= 2;
        Assert.assertEquals(arrayMaximalAdjacentDifference.arrayMaximalAdjacentDifference(inputArray),expectedResult);
    }
    @Test
    public void  check5(){
        int[] inputArray = {-2, -2, -2, -2, -2};
        int expectedResult= 0;
        Assert.assertEquals(arrayMaximalAdjacentDifference.arrayMaximalAdjacentDifference(inputArray),expectedResult);
    }
    @Test
    public void  check6(){
        int[] inputArray = {-1, 1, -3, -4};
        int expectedResult= 4;
        Assert.assertEquals(arrayMaximalAdjacentDifference.arrayMaximalAdjacentDifference(inputArray),expectedResult);
    }
}

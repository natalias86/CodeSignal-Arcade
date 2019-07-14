package codesignal.islandOfKnowledge;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AvoidObstaclesTest {
    public AvoidObstacles avoidObstacles;

    @Before
    public void setUp() {
        avoidObstacles = new AvoidObstacles();
    }
    @Test
    public void  check(){
        int[] inputArray = {5, 3, 6, 7, 9};
        int expectedResult= 4;
        Assert.assertEquals(avoidObstacles.avoidObstacles(inputArray),expectedResult);
    }
    @Test
    public void  check2(){
        int[] inputArray = {2, 3};
        int expectedResult= 4;
        Assert.assertEquals(avoidObstacles.avoidObstacles(inputArray),expectedResult);
    }
    @Test
    public void  check3(){
        int[] inputArray = {1, 4, 10, 6, 2};
        int expectedResult= 7;
        Assert.assertEquals(avoidObstacles.avoidObstacles(inputArray),expectedResult);
    }
    @Test
    public void  check4(){
        int[] inputArray = {1000, 999};
        int expectedResult= 6;
        Assert.assertEquals(avoidObstacles.avoidObstacles(inputArray),expectedResult);
    }
    @Test
    public void  check5(){
        int[] inputArray = {19, 32, 11, 23};
        int expectedResult= 3;
        Assert.assertEquals(avoidObstacles.avoidObstacles(inputArray),expectedResult);
    }
    @Test
    public void  check6(){
        int[] inputArray = {5, 8, 9, 13, 14};
        int expectedResult= 6;
        Assert.assertEquals(avoidObstacles.avoidObstacles(inputArray),expectedResult);
    }
}

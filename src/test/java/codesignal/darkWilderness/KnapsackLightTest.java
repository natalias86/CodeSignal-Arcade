package codesignal.darkWilderness;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class KnapsackLightTest {
    public KnapsackLight knapsackLight;

    @Before
    public void setUp() {
        knapsackLight = new KnapsackLight();
    }

    @Test
    public void check() {
        int value1 = 10;
        int weight1 = 5;
        int value2 = 6;
        int weight2 = 4;
        int maxW = 8;
        int expectedResult = 10;
        Assert.assertEquals(knapsackLight.knapsackLight(value1,weight1,value2,weight2,maxW), expectedResult);
    }
    @Test
    public void check2() {
        int value1 = 10;
        int weight1 = 5;
        int value2 = 6;
        int weight2 = 4;
        int maxW = 9;
        int expectedResult = 16;
        Assert.assertEquals(knapsackLight.knapsackLight(value1,weight1,value2,weight2,maxW), expectedResult);
    }
    @Test
    public void check3() {
        int value1 = 5;
        int weight1 = 3;
        int value2 = 7;
        int weight2 = 4;
        int maxW = 6;
        int expectedResult = 7;
        Assert.assertEquals(knapsackLight.knapsackLight(value1,weight1,value2,weight2,maxW), expectedResult);
    }
    @Test
    public void check4() {
        int value1 = 10;
        int weight1 = 2;
        int value2 = 11;
        int weight2 = 3;
        int maxW = 1;
        int expectedResult = 0;
        Assert.assertEquals(knapsackLight.knapsackLight(value1,weight1,value2,weight2,maxW), expectedResult);
    }
    @Test
    public void check5() {
        int value1 = 15;
        int weight1 = 2;
        int value2 = 20;
        int weight2 = 3;
        int maxW = 2;
        int expectedResult = 15;
        Assert.assertEquals(knapsackLight.knapsackLight(value1,weight1,value2,weight2,maxW), expectedResult);
    }
    @Test
    public void check6() {
        int value1 = 2;
        int weight1 = 5;
        int value2 = 3;
        int weight2 = 4;
        int maxW = 5;
        int expectedResult = 3;
        Assert.assertEquals(knapsackLight.knapsackLight(value1,weight1,value2,weight2,maxW), expectedResult);
    }
    @Test
    public void check7() {
        int value1 = 4;
        int weight1 = 3;
        int value2 = 3;
        int weight2 = 4;
        int maxW = 4;
        int expectedResult = 4;
        Assert.assertEquals(knapsackLight.knapsackLight(value1,weight1,value2,weight2,maxW), expectedResult);
    }
    @Test
    public void check8() {
        int value1 = 3;
        int weight1 = 5;
        int value2 = 3;
        int weight2 = 8;
        int maxW = 10;
        int expectedResult = 3;
        Assert.assertEquals(knapsackLight.knapsackLight(value1,weight1,value2,weight2,maxW), expectedResult);
    }
}

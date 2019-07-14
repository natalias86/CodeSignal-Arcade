package codesignal.darkWilderness;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GrowingPlantTest {
    public GrowingPlant growingPlant;

    @Before
    public void setUp() {
        growingPlant = new GrowingPlant();
    }

    @Test
    public void check() {
       int upSpeed =100;
       int downSpeed= 10;
       int desiredHeigh= 910;
       int expectedResult = 10;
        Assert.assertEquals(growingPlant.growingPlant(upSpeed,downSpeed,desiredHeigh), expectedResult);
    }
    @Test
    public void check2() {
        int upSpeed =10;
        int downSpeed= 9;
        int desiredHeigh= 4;
        int expectedResult = 1;
        Assert.assertEquals(growingPlant.growingPlant(upSpeed,downSpeed,desiredHeigh), expectedResult);
    }
    @Test
    public void check3() {
        int upSpeed =5;
        int downSpeed= 2;
        int desiredHeigh= 7;
        int expectedResult = 2;
        Assert.assertEquals(growingPlant.growingPlant(upSpeed,downSpeed,desiredHeigh), expectedResult);
    }
    @Test
    public void check4() {
        int upSpeed =7;
        int downSpeed= 3;
        int desiredHeigh= 443;
        int expectedResult = 110;
        Assert.assertEquals(growingPlant.growingPlant(upSpeed,downSpeed,desiredHeigh), expectedResult);
    }
    @Test
    public void check5() {
        int upSpeed =6;
        int downSpeed= 5;
        int desiredHeigh= 10;
        int expectedResult = 5;
        Assert.assertEquals(growingPlant.growingPlant(upSpeed,downSpeed,desiredHeigh), expectedResult);
    }
}

package codesignal.edgeOfTheOcean;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ShapeAreaTest {
    public ShapeArea shapeAreaObj;

    @Before
    public void setUp() {
        shapeAreaObj = new ShapeArea();
    }
    @Test
    public void  check(){
        int n = 2;
        int expectedResult=5;
        Assert.assertEquals(shapeAreaObj.shapeArea(n),expectedResult);
    }
    @Test
    public void  check2(){
        int n = 3;
        int expectedResult = 13;
        Assert.assertEquals(shapeAreaObj.shapeArea(n),expectedResult);
    }
    @Test
    public void  check3(){
        int n = 1;
        int expectedResult=1;
        Assert.assertEquals(shapeAreaObj.shapeArea(n),expectedResult);
    }
    @Test
    public void  check4(){
        int n = 5;
        int expectedResult=41;
        Assert.assertEquals(shapeAreaObj.shapeArea(n),expectedResult);
    }
    @Test
    public void  check5(){
        int n = 7000;
        int expectedResult=97986001;
        Assert.assertEquals(shapeAreaObj.shapeArea(n),expectedResult);
    }
    @Test
    public void  check6(){
        int n = 8000;
        int expectedResult=127984001;
        Assert.assertEquals(shapeAreaObj.shapeArea(n),expectedResult);
    }
    @Test
    public void  check7(){
        int n = 9999;
        int expectedResult=199940005;
        Assert.assertEquals(shapeAreaObj.shapeArea(n),expectedResult);
    }
    @Test
    public void  check8(){
        int n = 9998;
        int expectedResult=199900013;
        Assert.assertEquals(shapeAreaObj.shapeArea(n),expectedResult);
    }

    @Test
    public void  check9(){
        int n = 8999;
        int expectedResult=161946005;
        Assert.assertEquals(shapeAreaObj.shapeArea(n),expectedResult);
    }

    @Test
    public void  check10(){
        int n = 100;
        int expectedResult=19801;
        Assert.assertEquals(shapeAreaObj.shapeArea(n),expectedResult);
    }


}

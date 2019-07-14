package codesignal.edgeOfTheOcean;

import codesignal.theJourneyBegins.CheckPalindrome;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AdjacentElementsProductTest {

    public AdjacentElementsProduct adjacentElementsProductObj;

    @Before
    public void setUp() {
        adjacentElementsProductObj = new AdjacentElementsProduct();
    }
    @Test
    public void  check(){
        int[] inputArray={5, 1, 2, 3, 1, 4};
        int expectedResult=6;
        Assert.assertEquals(adjacentElementsProductObj.adjacentElementsProduct(inputArray),expectedResult);
    }
    @Test
    public void  check2(){
        int[] inputArray={-1, -2};
        int expectedResult=2;
        Assert.assertEquals(adjacentElementsProductObj.adjacentElementsProduct(inputArray),expectedResult);
    }
    @Test
    public void  check3(){
        int[] inputArray={1, 2, 3, 0};
        int expectedResult=6;
        Assert.assertEquals(adjacentElementsProductObj.adjacentElementsProduct(inputArray),expectedResult);
    }
    @Test
    public void  check4(){
        int[] inputArray={3, 6, -2, -5, 7, 3};
        int expectedResult=21;
        Assert.assertEquals(adjacentElementsProductObj.adjacentElementsProduct(inputArray),expectedResult);
    }
}

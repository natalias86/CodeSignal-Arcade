package codesignal.throughTheFog;

import codesignal.theJourneyBegins.CenturyFromYear;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CircleOfNumbersTest {
    public CircleOfNumbers circleOfNumbers;

    @Before
    public void setUp() {
        circleOfNumbers = new CircleOfNumbers();
    }
    @Test
    public void  check(){
        int n=10;
        int firstNumber= 2;
        int expectedResult = 7;
        Assert.assertEquals(circleOfNumbers.circleOfNumbers(n,firstNumber),expectedResult);
    }
    @Test
    public void  check2(){
        int n=10;
        int firstNumber= 7;
        int expectedResult = 2;
        Assert.assertEquals(circleOfNumbers.circleOfNumbers(n,firstNumber),expectedResult);
    }
    @Test
    public void  check3(){
        int n=4;
        int firstNumber= 1;
        int expectedResult = 3;
        Assert.assertEquals(circleOfNumbers.circleOfNumbers(n,firstNumber),expectedResult);
    }
    @Test
    public void  check4(){
        int n=6;
        int firstNumber= 3;
        int expectedResult = 0;
        Assert.assertEquals(circleOfNumbers.circleOfNumbers(n,firstNumber),expectedResult);
    }
    @Test
    public void  check5(){
        int n=18;
        int firstNumber= 6;
        int expectedResult = 15;
        Assert.assertEquals(circleOfNumbers.circleOfNumbers(n,firstNumber),expectedResult);
    }
    @Test
    public void  check6(){
        int n=12;
        int firstNumber= 10;
        int expectedResult = 4;
        Assert.assertEquals(circleOfNumbers.circleOfNumbers(n,firstNumber),expectedResult);
    }
    @Test
    public void  check7(){
        int n=18;
        int firstNumber= 5;
        int expectedResult = 14;
        Assert.assertEquals(circleOfNumbers.circleOfNumbers(n,firstNumber),expectedResult);
    }
}

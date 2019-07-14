package codesignal.theJourneyBegins;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CenturyFromYearTest {


    public CenturyFromYear centuryFromYearObj;

    @Before
    public void setUp() {
        centuryFromYearObj = new CenturyFromYear();
    }
    @Test
    public void  check(){
        int year = 1905;
        int expectedResult = 20;

        Assert.assertEquals(centuryFromYearObj.centuryFromYear(year),expectedResult);
    }

    @Test
    public void  check2(){
        int year = 1700;
        int expectedResult = 17;

        Assert.assertEquals(centuryFromYearObj.centuryFromYear(year),expectedResult);
    }
    @Test
    public void  check3(){
        int year = 2000;
        int expectedResult = 20;

        Assert.assertEquals(centuryFromYearObj.centuryFromYear(year),expectedResult);
    }
    @Test
    public void  check4(){
        int year = 2001;
        int expectedResult = 21;

        Assert.assertEquals(centuryFromYearObj.centuryFromYear(year),expectedResult);
    }
    @Test
    public void  check5(){
        int year = 374;
        int expectedResult = 4;

        Assert.assertEquals(centuryFromYearObj.centuryFromYear(year),expectedResult);
    }
    @Test
    public void  check6(){
        int year = 45;
        int expectedResult = 1;

        Assert.assertEquals(centuryFromYearObj.centuryFromYear(year),expectedResult);
    }
    @Test
    public void  check7(){
        int year = 200;
        int expectedResult = 2;

        Assert.assertEquals(centuryFromYearObj.centuryFromYear(year),expectedResult);
    }
}
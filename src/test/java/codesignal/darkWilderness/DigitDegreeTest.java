package codesignal.darkWilderness;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DigitDegreeTest {
    public DigitDegree digitDegree;

    @Before
    public void setUp() {
        digitDegree= new DigitDegree();
    }

    @Test
    public void check() {
        int n = 5;
        int expectedResult = 0;
        Assert.assertEquals(digitDegree.digitDegree(n), expectedResult);
    }
    @Test
    public void check2() {
        int n = 100;
        int expectedResult = 1;
        Assert.assertEquals(digitDegree.digitDegree(n), expectedResult);
    }
    @Test
    public void check3() {
        int n = 91;
        int expectedResult = 2;
        Assert.assertEquals(digitDegree.digitDegree(n), expectedResult);
    }
    @Test
    public void check4() {
        int n =99;
        int expectedResult = 2;
        Assert.assertEquals(digitDegree.digitDegree(n), expectedResult);
    }
    @Test
    public void check5() {
        int n = 1000000000;
        int expectedResult = 1;
        Assert.assertEquals(digitDegree.digitDegree(n), expectedResult);
    }
    @Test
    public void check6() {
        int n = 9;
        int expectedResult = 0;
        Assert.assertEquals(digitDegree.digitDegree(n), expectedResult);
    }
    @Test
    public void check7() {
        int n = 73;
        int expectedResult = 2;
        Assert.assertEquals(digitDegree.digitDegree(n), expectedResult);
    }
    @Test
    public void check8() {
        int n = 877;
        int expectedResult = 2;
        Assert.assertEquals(digitDegree.digitDegree(n), expectedResult);
    }
    @Test
    public void check9() {
        int n = 777773;
        int expectedResult = 3;
        Assert.assertEquals(digitDegree.digitDegree(n), expectedResult);
    }
    @Test
    public void check10() {
        int n = 304;
        int expectedResult = 1;
        Assert.assertEquals(digitDegree.digitDegree(n), expectedResult);
    }

}

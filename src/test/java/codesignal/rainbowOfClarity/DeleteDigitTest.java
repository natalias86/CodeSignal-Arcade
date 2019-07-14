package codesignal.rainbowOfClarity;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DeleteDigitTest {
    public DeleteDigit deleteDigit;

    @Before
    public void setUp() {
        deleteDigit = new DeleteDigit();
    }

    @Test
    public void check() {
        int n = 152;
        int expectedResult = 52;
        Assert.assertEquals(deleteDigit.deleteDigit(n), expectedResult);
    }
    @Test
    public void check2() {
        int n = 1001;
        int expectedResult = 101;
        Assert.assertEquals(deleteDigit.deleteDigit(n), expectedResult);
    }
    @Test
    public void check3() {
        int n = 10;
        int expectedResult = 1;
        Assert.assertEquals(deleteDigit.deleteDigit(n), expectedResult);
    }
    @Test
    public void check4() {
        int n = 222219;
        int expectedResult = 22229;
        Assert.assertEquals(deleteDigit.deleteDigit(n), expectedResult);
    }
    @Test
    public void check5() {
        int n = 109;
        int expectedResult = 19;
        Assert.assertEquals(deleteDigit.deleteDigit(n), expectedResult);
    }
    @Test
    public void check6() {
        int n = 222250;
        int expectedResult = 22250;
        Assert.assertEquals(deleteDigit.deleteDigit(n), expectedResult);
    }
    @Test
    public void check7() {
        int n = 44435;
        int expectedResult = 4445;
        Assert.assertEquals(deleteDigit.deleteDigit(n), expectedResult);
    }
    @Test
    public void check8() {
        int n = 12;
        int expectedResult = 2;
        Assert.assertEquals(deleteDigit.deleteDigit(n), expectedResult);
    }
    @Test
    public void check9() {
        int n = 218616;
        int expectedResult = 28616;
        Assert.assertEquals(deleteDigit.deleteDigit(n), expectedResult);
    }
    @Test
    public void check10() {
        int n = 861452;
        int expectedResult = 86452;
        Assert.assertEquals(deleteDigit.deleteDigit(n), expectedResult);
    }
}

package codesignal.divingDeeper;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FirstDigitTest{
    public FirstDigit firstDigit;

    @Before
    public void setUp() {
        firstDigit = new FirstDigit();
    }

    @Test
    public void check() {
        String inputString= "var_1__Int";
        char expectedResult = '1';
        Assert.assertEquals(firstDigit.firstDigit(inputString), expectedResult);
    }
    @Test
    public void check2() {
        String inputString= "q2q-q";
        char expectedResult = '2';
        Assert.assertEquals(firstDigit.firstDigit(inputString), expectedResult);
    }
    @Test
    public void check3() {
        String inputString= "0ss";
        char expectedResult = '0';
        Assert.assertEquals(firstDigit.firstDigit(inputString), expectedResult);
    }
    @Test
    public void check4() {
        String inputString= "_Aas_23";
        char expectedResult = '2';
        Assert.assertEquals(firstDigit.firstDigit(inputString), expectedResult);
    }
    @Test
    public void check5() {
        String inputString= "a a_933";
        char expectedResult = '9';
        Assert.assertEquals(firstDigit.firstDigit(inputString), expectedResult);
    }  @Test
    public void check6() {
        String inputString= "ok0";
        char expectedResult = '0';
        Assert.assertEquals(firstDigit.firstDigit(inputString), expectedResult);
    }

}

package codesignal.rainsOfReason;

import codesignal.exploringTheWater.ArrayChange;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AlphabeticShiftTest {

    public AlphabeticShift alphabeticShift;

    @Before
    public void setUp() {
        alphabeticShift = new AlphabeticShift();
    }

    @Test
    public void check() {
        String inputString= "crazy";
        String expectedResult = "dsbaz";
        Assert.assertEquals(alphabeticShift.alphabeticShift(inputString), expectedResult);
    }
    @Test
    public void check2() {
        String inputString= "z";
        String expectedResult = "a";
        Assert.assertEquals(alphabeticShift.alphabeticShift(inputString), expectedResult);
    }
    @Test
    public void check3() {
        String inputString= "aaaabbbccd";
        String expectedResult = "bbbbcccdde";
        Assert.assertEquals(alphabeticShift.alphabeticShift(inputString), expectedResult);
    }
    @Test
    public void check4() {
        String inputString= "fuzzy";
        String expectedResult = "gvaaz";
        Assert.assertEquals(alphabeticShift.alphabeticShift(inputString), expectedResult);
    }
    @Test
    public void check5() {
        String inputString= "codesignal";
        String expectedResult = "dpeftjhobm";
        Assert.assertEquals(alphabeticShift.alphabeticShift(inputString), expectedResult);
    }
}

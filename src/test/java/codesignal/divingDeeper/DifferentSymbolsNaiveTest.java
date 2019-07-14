package codesignal.divingDeeper;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DifferentSymbolsNaiveTest {
    public DifferentSymbolsNaive differentSymbolsNaive;

    @Before
    public void setUp() {
        differentSymbolsNaive = new DifferentSymbolsNaive();
    }

    @Test
    public void check() {
        String s=  "cabca";
        int expectedResult = 3;
        Assert.assertEquals(differentSymbolsNaive.differentSymbolsNaive(s), expectedResult);
    }
    @Test
    public void check2() {
        String s=  "aba";
        int expectedResult = 2;
        Assert.assertEquals(differentSymbolsNaive.differentSymbolsNaive(s), expectedResult);
    }
    @Test
    public void check3() {
        String s=  "ccccccccccc";
        int expectedResult = 1;
        Assert.assertEquals(differentSymbolsNaive.differentSymbolsNaive(s), expectedResult);
    }
    @Test
    public void check4() {
        String s=  "bcaba";
        int expectedResult = 3;
        Assert.assertEquals(differentSymbolsNaive.differentSymbolsNaive(s), expectedResult);
    }
    @Test
    public void check5() {
        String s=  "codesignal";
        int expectedResult = 10;
        Assert.assertEquals(differentSymbolsNaive.differentSymbolsNaive(s), expectedResult);
    }
}

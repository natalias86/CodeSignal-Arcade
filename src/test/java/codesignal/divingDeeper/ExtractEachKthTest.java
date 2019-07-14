package codesignal.divingDeeper;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ExtractEachKthTest {

    public ExtractEachKth extractEachKth;

    @Before
    public void setUp() {
        extractEachKth = new ExtractEachKth();
    }
    @Test
    public void check() {
        int[] inputArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int k = 3;
        int[] expectedResult = {1, 2, 4, 5, 7, 8, 10};
        Assert.assertArrayEquals(extractEachKth.extractEachKth(inputArray, k), expectedResult);
    }
    @Test
    public void check2() {
        int[] inputArray = {1, 1, 1, 1, 1};
        int k = 1;
        int[] expectedResult = {};
        Assert.assertArrayEquals(extractEachKth.extractEachKth(inputArray, k), expectedResult);
    }
    @Test
    public void check3() {
        int[] inputArray = {1, 2, 1, 2, 1, 2, 1, 2};
        int k = 2;
        int[] expectedResult = {1, 1, 1, 1};
        Assert.assertArrayEquals(extractEachKth.extractEachKth(inputArray, k), expectedResult);
    }
    @Test
    public void check4() {
        int[] inputArray = {1, 2, 1, 2, 1, 2, 1, 2};
        int k = 10;
        int[] expectedResult = {1, 2, 1, 2, 1, 2, 1, 2};
        Assert.assertArrayEquals(extractEachKth.extractEachKth(inputArray, k), expectedResult);
    }
    @Test
    public void check5() {
        int[] inputArray = {2, 4, 6, 8, 10};
        int k = 2;
        int[] expectedResult = {2, 6, 10};
        Assert.assertArrayEquals(extractEachKth.extractEachKth(inputArray, k), expectedResult);
    }
}

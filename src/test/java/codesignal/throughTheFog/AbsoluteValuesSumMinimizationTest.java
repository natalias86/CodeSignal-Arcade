package codesignal.throughTheFog;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AbsoluteValuesSumMinimizationTest {
    public AbsoluteValuesSumMinimization absoluteValuesSumMinimization;

    @Before
    public void setUp() {
        absoluteValuesSumMinimization = new AbsoluteValuesSumMinimization();
    }

    @Test
    public void check() {
        int[] a = {2, 4, 7};
        int expectedResult = 4;
        Assert.assertEquals(absoluteValuesSumMinimization.absoluteValuesSumMinimization(a), expectedResult);
    }

    @Test
    public void check2() {
        int[] a = {2, 3};
        int expectedResult = 2;
        Assert.assertEquals(absoluteValuesSumMinimization.absoluteValuesSumMinimization(a), expectedResult);
    }

    @Test
    public void check3() {
        int[] a = {1, 1, 3, 4};
        int expectedResult = 1;
        Assert.assertEquals(absoluteValuesSumMinimization.absoluteValuesSumMinimization(a), expectedResult);
    }

    @Test
    public void check4() {
        int[] a = {23};
        int expectedResult = 23;
        Assert.assertEquals(absoluteValuesSumMinimization.absoluteValuesSumMinimization(a), expectedResult);
    }

    @Test
    public void check5() {
        int[] a = {-10, -10, -10, -10, -10, -9, -9, -9, -8, -8, -7, -6, -5, -4, -3, -2, -1, 0, 0, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50};
        int expectedResult = 15;
        Assert.assertEquals(absoluteValuesSumMinimization.absoluteValuesSumMinimization(a), expectedResult);
    }

    @Test
    public void check6() {
        int[] a = {-4, -1};
        int expectedResult = -4;
        Assert.assertEquals(absoluteValuesSumMinimization.absoluteValuesSumMinimization(a), expectedResult);
    }

    @Test
    public void check7() {
        int[] a = {0, 7, 9};
        int expectedResult = 7;
        Assert.assertEquals(absoluteValuesSumMinimization.absoluteValuesSumMinimization(a), expectedResult);
    }

    @Test
    public void check8() {
        int[] a = {-1000000, -10000, -10000, -1000, -100, -10, -1, 0, 1, 10, 100, 1000, 10000, 100000, 1000000};
        int expectedResult = 0;
        Assert.assertEquals(absoluteValuesSumMinimization.absoluteValuesSumMinimization(a), expectedResult);
    }

    @Test
    public void check9() {
        int[] a = {-10, -9, -8, -7, -6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126, 127, 128, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140, 141, 142, 143, 144, 145, 146, 147, 148, 149, 150};
        int expectedResult = 65;
        Assert.assertEquals(absoluteValuesSumMinimization.absoluteValuesSumMinimization(a), expectedResult);
    }

    @Test
    public void check10() {
        int[] a = {-10, 100, 200, 300, 400, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500};
        int expectedResult = 500;
        Assert.assertEquals(absoluteValuesSumMinimization.absoluteValuesSumMinimization(a), expectedResult);
    }
}

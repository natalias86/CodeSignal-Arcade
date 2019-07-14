package codesignal.eruptionOfLight;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ElectionsWinnersTest {
    public ElectionsWinners electionsWinners;

    @Before
    public void setUp() {
        electionsWinners = new ElectionsWinners();
    }

    @Test
    public void check() {
        int[] votes = {2, 3, 5, 2};
        int k = 3;
        int expectedResult = 2;
        Assert.assertEquals(electionsWinners.electionsWinners(votes, k), expectedResult);
    }

    @Test
    public void check2() {
        int[] votes = {1, 3, 3, 1, 1};
        int k = 0;
        int expectedResult = 0;
        Assert.assertEquals(electionsWinners.electionsWinners(votes, k), expectedResult);
    }

    @Test
    public void check3() {
        int[] votes = {5, 1, 3, 4, 1};
        int k = 0;
        int expectedResult = 1;
        Assert.assertEquals(electionsWinners.electionsWinners(votes, k), expectedResult);
    }

    @Test
    public void check4() {
        int[] votes = {1, 1, 1, 1};
        int k = 1;
        int expectedResult = 4;
        Assert.assertEquals(electionsWinners.electionsWinners(votes, k), expectedResult);
    }

    @Test
    public void check5() {
        int[] votes = {1, 1, 1, 1};
        int k = 0;
        int expectedResult = 0;
        Assert.assertEquals(electionsWinners.electionsWinners(votes, k), expectedResult);
    }

    @Test
    public void check6() {
        int[] votes = {3, 1, 1, 3, 1};
        int k = 2;
        int expectedResult = 2;
        Assert.assertEquals(electionsWinners.electionsWinners(votes, k), expectedResult);
    }
}

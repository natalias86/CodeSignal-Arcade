package codesignal.throughTheFog;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DepositProfitTest {
    public DepositProfit depositProfit;

    @Before
    public void setUp() {
        depositProfit = new DepositProfit();
    }

    @Test
    public void check() {
        int deposit = 100;
        int rate = 20;
        int threshold = 170;
        int expectedResult = 3;
        Assert.assertEquals(depositProfit.depositProfit(deposit,rate,threshold), expectedResult);
    }
    @Test
    public void check2() {
        int deposit = 100;
        int rate = 1;
        int threshold = 101;
        int expectedResult = 1;
        Assert.assertEquals(depositProfit.depositProfit(deposit,rate,threshold), expectedResult);
    }
    @Test
    public void check3() {
        int deposit = 1;
        int rate = 100;
        int threshold = 64;
        int expectedResult = 6;
        Assert.assertEquals(depositProfit.depositProfit(deposit,rate,threshold), expectedResult);
    }
    @Test
    public void check4() {
        int deposit = 20;
        int rate = 20;
        int threshold = 50;
        int expectedResult = 6;
        Assert.assertEquals(depositProfit.depositProfit(deposit,rate,threshold), expectedResult);
    }
    @Test
    public void check5() {
        int deposit = 50;
        int rate = 25;
        int threshold = 100;
        int expectedResult = 4;
        Assert.assertEquals(depositProfit.depositProfit(deposit,rate,threshold), expectedResult);
    }
}

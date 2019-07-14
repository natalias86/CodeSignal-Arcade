package codesignal.islandOfKnowledge;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AreEquallyStrongTest {

    public AreEquallyStrong areEquallyStrong;

    @Before
    public void setUp() {
        areEquallyStrong = new AreEquallyStrong();
    }

    @Test
    public void check() {
        int yourLeft = 15;
        int yourRight = 10;
        int friendsLeft = 15;
        int friendsRight = 10;
        Assert.assertTrue(areEquallyStrong.areEquallyStrong(yourLeft,yourRight,friendsLeft,friendsRight));
    }
    @Test
    public void check2() {
        int yourLeft = 10;
        int yourRight = 15;
        int friendsLeft = 15;
        int friendsRight = 10;
        Assert.assertTrue(areEquallyStrong.areEquallyStrong(yourLeft,yourRight,friendsLeft,friendsRight));
    }
    @Test
    public void check3() {
        int yourLeft = 15;
        int yourRight = 10;
        int friendsLeft = 15;
        int friendsRight = 9;
        Assert.assertFalse(areEquallyStrong.areEquallyStrong(yourLeft,yourRight,friendsLeft,friendsRight));
    }
    @Test
    public void check4() {
        int yourLeft = 10;
        int yourRight = 5;
        int friendsLeft = 5;
        int friendsRight = 10;
        Assert.assertTrue(areEquallyStrong.areEquallyStrong(yourLeft,yourRight,friendsLeft,friendsRight));
    }
    @Test
    public void check5() {
        int yourLeft = 10;
        int yourRight = 15;
        int friendsLeft = 5;
        int friendsRight = 20;
        Assert.assertFalse(areEquallyStrong.areEquallyStrong(yourLeft,yourRight,friendsLeft,friendsRight));
    }
    @Test
    public void check6() {
        int yourLeft = 10;
        int yourRight = 20;
        int friendsLeft = 10;
        int friendsRight = 20;
        Assert.assertTrue(areEquallyStrong.areEquallyStrong(yourLeft,yourRight,friendsLeft,friendsRight));
    }
    @Test
    public void check7() {
        int yourLeft = 5;
        int yourRight = 20;
        int friendsLeft = 20;
        int friendsRight = 5;
        Assert.assertTrue(areEquallyStrong.areEquallyStrong(yourLeft,yourRight,friendsLeft,friendsRight));
    }
    @Test
    public void check8() {
        int yourLeft = 20;
        int yourRight = 15;
        int friendsLeft = 5;
        int friendsRight = 20;
        Assert.assertFalse(areEquallyStrong.areEquallyStrong(yourLeft,yourRight,friendsLeft,friendsRight));
    }
    @Test
    public void check9() {
        int yourLeft = 5;
        int yourRight = 10;
        int friendsLeft = 5;
        int friendsRight = 10;
        Assert.assertTrue(areEquallyStrong.areEquallyStrong(yourLeft,yourRight,friendsLeft,friendsRight));
    }
    @Test
    public void check10() {
        int yourLeft = 1;
        int yourRight = 10;
        int friendsLeft = 10;
        int friendsRight = 0;
        Assert.assertFalse(areEquallyStrong.areEquallyStrong(yourLeft,yourRight,friendsLeft,friendsRight));
    }
    @Test
    public void check11() {
        int yourLeft = 5;
        int yourRight = 5;
        int friendsLeft = 10;
        int friendsRight = 10;
        Assert.assertFalse(areEquallyStrong.areEquallyStrong(yourLeft,yourRight,friendsLeft,friendsRight));
    }
    @Test
    public void check12() {
        int yourLeft = 10;
        int yourRight = 5;
        int friendsLeft = 10;
        int friendsRight = 6;
        Assert.assertFalse(areEquallyStrong.areEquallyStrong(yourLeft,yourRight,friendsLeft,friendsRight));
    }
    @Test
    public void check13() {
        int yourLeft = 1;
        int yourRight = 1;
        int friendsLeft = 1;
        int friendsRight = 1;
        Assert.assertTrue(areEquallyStrong.areEquallyStrong(yourLeft,yourRight,friendsLeft,friendsRight));
    }
    @Test
    public void check14() {
        int yourLeft = 0;
        int yourRight = 10;
        int friendsLeft = 10;
        int friendsRight = 0;
        Assert.assertTrue(areEquallyStrong.areEquallyStrong(yourLeft,yourRight,friendsLeft,friendsRight));
    }
}

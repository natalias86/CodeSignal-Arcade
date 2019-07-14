package codesignal.smoothSailing;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class sortByHeightTest {
    public SortByHeight sortByHeightObj;

    @Before
    public void setUp() {
        sortByHeightObj = new SortByHeight();
    }
    @Test
    public void  check(){
        int[] a={-1, 150, 190, 170, -1, -1, 160, 180};
        int[] expectedResult= {-1, 150, 160, 170, -1, -1, 180, 190};
        Assert.assertArrayEquals(sortByHeightObj.sortByHeight(a),expectedResult);
    }
    @Test
    public void  check2(){
        int[] a={-1, -1, -1, -1, -1};
        int[] expectedResult= {-1, -1, -1, -1, -1};
        Assert.assertArrayEquals(sortByHeightObj.sortByHeight(a),expectedResult);
    }
    @Test
    public void  check3(){
        int[] a={-1};
        int[] expectedResult= {-1};
        Assert.assertArrayEquals(sortByHeightObj.sortByHeight(a),expectedResult);
    }
    @Test
    public void  check4(){
        int[] a={4, 2, 9, 11, 2, 16};
        int[] expectedResult= {2, 2, 4, 9, 11, 16};
        Assert.assertArrayEquals(sortByHeightObj.sortByHeight(a),expectedResult);
    }
    @Test
    public void  check5(){
        int[] a={2, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 1};
        int[] expectedResult= {1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 2};
        Assert.assertArrayEquals(sortByHeightObj.sortByHeight(a),expectedResult);
    }
    @Test
    public void  check6(){
        int[] a={23, 54, -1, 43, 1, -1, -1, 77, -1, -1, -1, 3};
        int[] expectedResult= {1, 3, -1, 23, 43, -1, -1, 54, -1, -1, -1, 77};
        Assert.assertArrayEquals(sortByHeightObj.sortByHeight(a),expectedResult);
    }
}

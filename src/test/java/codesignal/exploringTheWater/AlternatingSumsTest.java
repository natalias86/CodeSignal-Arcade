package codesignal.exploringTheWater;

import codesignal.landOfLogic.FileNaming;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AlternatingSumsTest {

    public AlternatingSums alternatingSums;

    @Before
    public void setUp() {
        alternatingSums = new AlternatingSums();
    }
    @Test
    public void  check(){
        int[] a = {50, 60, 60, 45, 70};
        int[] expectedResult= {180, 105};
        Assert.assertArrayEquals(alternatingSums.alternatingSums(a),expectedResult);
    }
    @Test
    public void  check2(){
        int[] a = {100, 50};
        int[] expectedResult= {100, 50};
        Assert.assertArrayEquals(alternatingSums.alternatingSums(a),expectedResult);
    }
    @Test
    public void  check3(){
        int[] a = {80};
        int[] expectedResult= {80, 0};
        Assert.assertArrayEquals(alternatingSums.alternatingSums(a),expectedResult);
    }
    @Test
    public void  check4(){
        int[] a = {100, 50, 50, 100};
        int[] expectedResult= {150,150};
        Assert.assertArrayEquals(alternatingSums.alternatingSums(a),expectedResult);
    }
    @Test
    public void  check5(){
        int[] a = {100, 51, 50, 100};
        int[] expectedResult= {150,151};
        Assert.assertArrayEquals(alternatingSums.alternatingSums(a),expectedResult);
    }
}

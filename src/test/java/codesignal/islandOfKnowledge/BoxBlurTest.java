package codesignal.islandOfKnowledge;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BoxBlurTest {


    public BoxBlur boxBlur;

    @Before
    public void setUp() {
        boxBlur = new BoxBlur();
    }
    @Test
    public void  check(){
        int[][] image = {{1,1,1},
                {1,7,1},
                {1,1,1}};
        int[][] expectedResult= {{1}};
        Assert.assertArrayEquals(boxBlur.boxBlur(image),expectedResult);
    }
    @Test
    public void  check2(){
        int[][] image = {{0,18,9},
                {27,9,0},
                {81,63,45}};
        int[][] expectedResult= {{28}};
        Assert.assertArrayEquals(boxBlur.boxBlur(image),expectedResult);
    }
    @Test
    public void  check3(){
        int[][] image = {{36,0,18,9},
                {27,54,9,0},
                {81,63,72,45}};
        int[][] expectedResult= {{40,30}};
        Assert.assertArrayEquals(boxBlur.boxBlur(image),expectedResult);
    }
    @Test
    public void  check4(){
        int[][] image = {{7,4,0,1},
                {5,6,2,2},
                {6,10,7,8},
                {1,4,2,0}};
        int[][] expectedResult= {{5,4},
                {4,4}};
        Assert.assertArrayEquals(boxBlur.boxBlur(image),expectedResult);
    }
    @Test
    public void  check5(){
        int[][] image = {{36,0,18,9,9,45,27},
                {27,0,54,9,0,63,90},
                {81,63,72,45,18,27,0},
                {0,0,9,81,27,18,45},
                {45,45,27,27,90,81,72},
                {45,18,9,0,9,18,45},
                {27,81,36,63,63,72,81}};
        int[][] expectedResult= {{39,30,26,25,31},
                {34,37,35,32,32},
                {38,41,44,46,42},
                {22,24,31,39,45},
                {37,34,36,47,59}};
        Assert.assertArrayEquals(boxBlur.boxBlur(image),expectedResult);
    }
}

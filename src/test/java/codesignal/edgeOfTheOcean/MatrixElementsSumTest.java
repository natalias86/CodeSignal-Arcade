package codesignal.edgeOfTheOcean;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MatrixElementsSumTest {

    public MatrixElementsSum matrixElementsSumObj;

    @Before
    public void setUp() {
        matrixElementsSumObj = new MatrixElementsSum();
    }
    @Test
    public void  check(){
        int[][] matrix={{0,1,1,2},
                {0,5,0,0},
                {2,0,3,3}};
        Assert.assertEquals(matrixElementsSumObj.matrixElementsSum(matrix),9);
    }
    @Test
    public void  check2(){
        int[][] matrix={{1,1,1,0},
                {0,5,0,1},
                {2,1,3,10}};
        Assert.assertEquals(matrixElementsSumObj.matrixElementsSum(matrix),9);
    }
    @Test
    public void  check3(){
        int[][] matrix={{1,1,1},
                {2,2,2},
                {3,3,3}};
        Assert.assertEquals(matrixElementsSumObj.matrixElementsSum(matrix),18);
    }
    @Test
    public void  check4(){
        int[][] matrix={{0}};
        Assert.assertEquals(matrixElementsSumObj.matrixElementsSum(matrix),0);
    }
    @Test
    public void  check5(){
        int[][] matrix={{1,0,3},
                {0,2,1},
                {1,2,0}};
        Assert.assertEquals(matrixElementsSumObj.matrixElementsSum(matrix),5);
    }

}

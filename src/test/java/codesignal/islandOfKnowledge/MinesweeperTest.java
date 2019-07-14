package codesignal.islandOfKnowledge;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MinesweeperTest {
    public Minesweeper minesweeper;

    @Before
    public void setUp() {
        minesweeper = new Minesweeper();
    }
    @Test
    public void  check(){
        boolean[][] matrix = {{true,false,false},
                {false,true,false},
                {false,false,false}};
        int[][] expectedResult= {{1,2,1},
                                {2,1,1},
                                {1,1,1}};
        Assert.assertArrayEquals(minesweeper.minesweeper(matrix),expectedResult);
    }
    @Test
    public void  check2(){
        boolean[][] matrix = {{false,false,false},
                {false,false,false}};
        int[][] expectedResult= {{0,0,0},
                                 {0,0,0}};
        Assert.assertArrayEquals(minesweeper.minesweeper(matrix),expectedResult);
    }
    @Test
    public void  check3(){
        boolean[][] matrix = {{true,false,false,true},
                {false,false,true,false},
                {true,true,false,true}};
        int[][] expectedResult= {{0,2,2,1},
                {3,4,3,3},
                {1,2,3,1}};
        Assert.assertArrayEquals(minesweeper.minesweeper(matrix),expectedResult);
    }
    @Test
    public void  check4(){
        boolean[][] matrix = {{true,true,true},
                {true,true,true},
                {true,true,true}};
        int[][] expectedResult= {{3,5,3},
                {5,8,5},
                {3,5,3}};
        Assert.assertArrayEquals(minesweeper.minesweeper(matrix),expectedResult);
    }
    @Test
    public void  check5(){
        boolean[][] matrix = {{false,true,true,false},
                {true,true,false,true},
                {false,false,true,false}};
        int[][] expectedResult= {{3,3,3,2},
                {2,4,5,2},
                {2,3,2,2}};
        Assert.assertArrayEquals(minesweeper.minesweeper(matrix),expectedResult);
    }
    @Test
    public void  check6(){
        boolean[][] matrix = {{true,false},
                {true,false},
                {false,true},
                {false,false},
                {false,false}};
        int[][] expectedResult= {{1,2},
                {2,3},
                {2,1},
                {1,1},
                {0,0}};
        Assert.assertArrayEquals(minesweeper.minesweeper(matrix),expectedResult);
    }
}

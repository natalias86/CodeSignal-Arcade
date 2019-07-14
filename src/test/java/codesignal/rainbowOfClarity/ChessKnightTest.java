package codesignal.rainbowOfClarity;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ChessKnightTest {
    public ChessKnight chessKnight;

    @Before
    public void setUp() {
        chessKnight = new ChessKnight();
    }

    @Test
    public void check() {
        String cell = "a1";
        int expectedResult = 2;
        Assert.assertEquals(chessKnight.chessKnight(cell), expectedResult);
    }
    @Test
    public void check2() {
        String cell = "c2";
        int expectedResult = 6;
        Assert.assertEquals(chessKnight.chessKnight(cell), expectedResult);
    }
    @Test
    public void check3() {
        String cell = "d4";
        int expectedResult = 8;
        Assert.assertEquals(chessKnight.chessKnight(cell), expectedResult);
    }
    @Test
    public void check4() {
        String cell = "g6";
        int expectedResult = 6;
        Assert.assertEquals(chessKnight.chessKnight(cell), expectedResult);
    }
    @Test
    public void check5() {
        String cell = "a3";
        int expectedResult = 4;
        Assert.assertEquals(chessKnight.chessKnight(cell), expectedResult);
    }
    @Test
    public void check6() {
        String cell = "b7";
        int expectedResult = 4;
        Assert.assertEquals(chessKnight.chessKnight(cell), expectedResult);
    }
    @Test
    public void check7() {
        String cell = "h8";
        int expectedResult = 2;
        Assert.assertEquals(chessKnight.chessKnight(cell), expectedResult);
    }
    @Test
    public void check8() {
        String cell = "h6";
        int expectedResult = 4;
        Assert.assertEquals(chessKnight.chessKnight(cell), expectedResult);
    }
    @Test
    public void check9() {
        String cell = "g8";
        int expectedResult = 3;
        Assert.assertEquals(chessKnight.chessKnight(cell), expectedResult);
    }
    @Test
    public void check10() {
        String cell = "a5";
        int expectedResult = 4;
        Assert.assertEquals(chessKnight.chessKnight(cell), expectedResult);
    }
}

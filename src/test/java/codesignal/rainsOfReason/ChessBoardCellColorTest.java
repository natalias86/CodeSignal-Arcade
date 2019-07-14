package codesignal.rainsOfReason;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ChessBoardCellColorTest {
    public ChessBoardCellColor chessBoardCellColor;

    @Before
    public void setUp() {
        chessBoardCellColor= new ChessBoardCellColor();
    }
    @Test
    public void  check(){
       String cell1= "A1";
       String cell2= "C3";
       Assert.assertTrue(chessBoardCellColor.chessBoardCellColor(cell1,cell2));
    }
    @Test
    public void  check2(){
        String cell1= "A1";
        String cell2= "H3";
        Assert.assertFalse(chessBoardCellColor.chessBoardCellColor(cell1,cell2));
    }
    @Test
    public void  check3(){
        String cell1= "A1";
        String cell2= "A2";
        Assert.assertFalse(chessBoardCellColor.chessBoardCellColor(cell1,cell2));
    }    @Test
    public void  check4(){
        String cell1= "A1";
        String cell2= "B2";
        Assert.assertTrue(chessBoardCellColor.chessBoardCellColor(cell1,cell2));
    }
    @Test
    public void  check5(){
        String cell1= "B3";
        String cell2= "H8";
        Assert.assertFalse(chessBoardCellColor.chessBoardCellColor(cell1,cell2));
    }
    @Test
    public void  check6(){
        String cell1= "C3";
        String cell2= "B5";
        Assert.assertFalse(chessBoardCellColor.chessBoardCellColor(cell1,cell2));
    }
    @Test
    public void  check7(){
        String cell1= "G5";
        String cell2= "E7";
        Assert.assertTrue(chessBoardCellColor.chessBoardCellColor(cell1,cell2));
    }
    @Test
    public void  check8(){
        String cell1= "C8";
        String cell2= "H8";
        Assert.assertFalse(chessBoardCellColor.chessBoardCellColor(cell1,cell2));
    }
    @Test
    public void  check9(){
        String cell1= "D2";
        String cell2= "D2";
        Assert.assertTrue(chessBoardCellColor.chessBoardCellColor(cell1,cell2));
    }
    @Test
    public void  check10(){
        String cell1= "A2";
        String cell2= "A5";
        Assert.assertFalse(chessBoardCellColor.chessBoardCellColor(cell1,cell2));
    }

}

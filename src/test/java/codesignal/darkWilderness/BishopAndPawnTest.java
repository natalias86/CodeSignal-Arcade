package codesignal.darkWilderness;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BishopAndPawnTest {
    public BishopAndPawn bishopAndPawn;

    @Before
    public void setUp() {
        bishopAndPawn= new BishopAndPawn();
    }

    @Test
    public void check() {
        String bishop ="a1";
        String pawn= "c3";
        Assert.assertTrue(bishopAndPawn.bishopAndPawn(bishop,pawn));
    }
    @Test
    public void check2() {
        String bishop ="h1";
        String pawn= "h3";
        Assert.assertFalse(bishopAndPawn.bishopAndPawn(bishop,pawn));
    }
    @Test
    public void check3() {
        String bishop ="a5";
        String pawn= "c3";
        Assert.assertTrue(bishopAndPawn.bishopAndPawn(bishop,pawn));
    }
    @Test
    public void check4() {
        String bishop ="g1";
        String pawn= "f3";
        Assert.assertFalse(bishopAndPawn.bishopAndPawn(bishop,pawn));
    }
    @Test
    public void check5() {
        String bishop ="e7";
        String pawn= "d6";
        Assert.assertTrue(bishopAndPawn.bishopAndPawn(bishop,pawn));
    }
    @Test
    public void check6() {
        String bishop ="e7";
        String pawn= "a3";
        Assert.assertTrue(bishopAndPawn.bishopAndPawn(bishop,pawn));
    }
    @Test
    public void check7() {
        String bishop ="e3";
        String pawn= "a7";
        Assert.assertTrue(bishopAndPawn.bishopAndPawn(bishop,pawn));
    }
    @Test
    public void check8() {
        String bishop ="a1";
        String pawn= "h8";
        Assert.assertTrue(bishopAndPawn.bishopAndPawn(bishop,pawn));
    }
    @Test
    public void check9() {
        String bishop ="a1";
        String pawn= "h7";
        Assert.assertFalse(bishopAndPawn.bishopAndPawn(bishop,pawn));
    }
    @Test
    public void check10() {
        String bishop ="h1";
        String pawn= "a8";
        Assert.assertTrue(bishopAndPawn.bishopAndPawn(bishop,pawn));
    }
}

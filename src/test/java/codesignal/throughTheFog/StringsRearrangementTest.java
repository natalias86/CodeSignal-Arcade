package codesignal.throughTheFog;

import codesignal.landOfLogic.FileNaming;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringsRearrangementTest {

    public StringsRearrangement stringsRearrangement;

    @Before
    public void setUp() {
        stringsRearrangement = new StringsRearrangement();
    }

    @Test
    public void check() {
        String[] inputArray = {"aba",
                "bbb",
                "bab"};
        Assert.assertFalse(stringsRearrangement.stringsRearrangement(inputArray));
    }

    @Test
    public void check2() {
        String[] inputArray = {"ab",
                "bb",
                "aa"};
        Assert.assertTrue(stringsRearrangement.stringsRearrangement(inputArray));
    }

    @Test
    public void check3() {
        String[] inputArray = {"q",
                "q"};
        Assert.assertFalse(stringsRearrangement.stringsRearrangement(inputArray));
    }

    @Test
    public void check4() {
        String[] inputArray = {"zzzzab",
                "zzzzbb",
                "zzzzaa"};
        Assert.assertTrue(stringsRearrangement.stringsRearrangement(inputArray));
    }

    @Test
    public void check5() {
        String[] inputArray = {"ab",
                "ad",
                "ef",
                "eg"};
        Assert.assertFalse(stringsRearrangement.stringsRearrangement(inputArray));
    }

    @Test
    public void check6() {
        String[] inputArray = {"abc",
                "bef",
                "bcc",
                "bec",
                "bbc",
                "bdc"};
        Assert.assertTrue(stringsRearrangement.stringsRearrangement(inputArray));
    }

    @Test
    public void check7() {
        String[] inputArray = {"abc",
                "abx",
                "axx",
                "abc"};
        Assert.assertFalse(stringsRearrangement.stringsRearrangement(inputArray));
    }

    @Test
    public void check8() {
        String[] inputArray = {"abc",
                "abx",
                "axx",
                "abx",
                "abc"};
        Assert.assertTrue(stringsRearrangement.stringsRearrangement(inputArray));
    }

    @Test
    public void check9() {
        String[] inputArray = {"f",
                "g",
                "a",
                "h"};
        Assert.assertTrue(stringsRearrangement.stringsRearrangement(inputArray));
    }

    @Test
    public void check10() {
        String[] inputArray = {"ff",
                "gf",
                "af",
                "ar",
                "hf"};
        Assert.assertTrue(stringsRearrangement.stringsRearrangement(inputArray));
    }

    @Test
    public void check11() {
        String[] inputArray = {"a",
                "b",
                "c"};
        Assert.assertTrue(stringsRearrangement.stringsRearrangement(inputArray));
    }
}

package codesignal.smoothSailing;

import codesignal.edgeOfTheOcean.AdjacentElementsProduct;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AllLongestStringsTest {

    public AllLongestStrings allLongestStringsObj;

    @Before
    public void setUp() {
        allLongestStringsObj = new AllLongestStrings();
    }
    @Test
    public void  check(){
        String[] inputArray= {"aba","aa","ad","vcd","aba"};
        String[] expectedResult= {"aba","vcd","aba"};
        Assert.assertArrayEquals(allLongestStringsObj.allLongestStrings(inputArray),expectedResult);
    }
    @Test
    public void  check2(){
        String[] inputArray= {"aa"};
        String[] expectedResult= {"aa"};
        Assert.assertArrayEquals(allLongestStringsObj.allLongestStrings(inputArray),expectedResult);
    }
    @Test
    public void  check3(){
        String[] inputArray= {"abc","eeee","abcd", "dcd"};
        String[] expectedResult= {"eeee","abcd"};
        Assert.assertArrayEquals(allLongestStringsObj.allLongestStrings(inputArray),expectedResult);
    }
    @Test
    public void  check4(){
        String[] inputArray= {"a","abc","cbd","zzzzzz","a","abcdef","asasa","aaaaaa"};
        String[] expectedResult= {"zzzzzz", "abcdef","aaaaaa"};
        Assert.assertArrayEquals(allLongestStringsObj.allLongestStrings(inputArray),expectedResult);
    }
    @Test
    public void  check5(){
        String[] inputArray= {"enyky",
                "benyky",
                "yely",
                "varennyky"};
        String[] expectedResult= {"varennyky"};
        Assert.assertArrayEquals(allLongestStringsObj.allLongestStrings(inputArray),expectedResult);
    }
    @Test
    public void  check6(){
        String[] inputArray= {"abacaba",
                "abacab",
                "abac",
                "xxxxxx"};
        String[] expectedResult= {"abacaba"};
        Assert.assertArrayEquals(allLongestStringsObj.allLongestStrings(inputArray),expectedResult);
    }
    @Test
    public void  check7(){
        String[] inputArray= {"young",
                "yooooooung",
                "hot",
                "or",
                "not",
                "come",
                "on",
                "fire",
                "water",
                "watermelon"};
        String[] expectedResult= {"yooooooung",
                "watermelon"};
        Assert.assertArrayEquals(allLongestStringsObj.allLongestStrings(inputArray),expectedResult);
    }
    @Test
    public void  check8(){
        String[] inputArray= {"onsfnib",
                "aokbcwthc",
                "jrfcw"};
        String[] expectedResult= {"aokbcwthc"};
        Assert.assertArrayEquals(allLongestStringsObj.allLongestStrings(inputArray),expectedResult);
    }
}

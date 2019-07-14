package codesignal.rainbowOfClarity;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LineEncodingTest {
    public LineEncoding lineEncoding;

    @Before
    public void setUp() {
        lineEncoding = new LineEncoding();
    }

    @Test
    public void check() {
        String s= "aabbbc";
        String expectedResult = "2a3bc";
        Assert.assertEquals(lineEncoding.lineEncoding(s), expectedResult);
    }
    @Test
    public void check2() {
        String s= "abbcabb";
        String expectedResult = "a2bca2b";
        Assert.assertEquals(lineEncoding.lineEncoding(s), expectedResult);
    }
    @Test
    public void check3() {
        String s= "abcd";
        String expectedResult = "abcd";
        Assert.assertEquals(lineEncoding.lineEncoding(s), expectedResult);
    }
    @Test
    public void check4() {
        String s= "zzzz";
        String expectedResult = "4z";
        Assert.assertEquals(lineEncoding.lineEncoding(s), expectedResult);
    }
    @Test
    public void check5() {
        String s= "wwwwwwwawwwwwww";
        String expectedResult = "7wa7w";
        Assert.assertEquals(lineEncoding.lineEncoding(s), expectedResult);
    }
    @Test
    public void check6() {
        String s= "ccccccccccccccc";
        String expectedResult = "15c";
        Assert.assertEquals(lineEncoding.lineEncoding(s), expectedResult);
    }
    @Test
    public void check7() {
        String s= "qwertyuioplkjhg";
        String expectedResult = "qwertyuioplkjhg";
        Assert.assertEquals(lineEncoding.lineEncoding(s), expectedResult);
    }
    @Test
    public void check8() {
        String s= "ssiiggkooo";
        String expectedResult = "2s2i2gk3o";
        Assert.assertEquals(lineEncoding.lineEncoding(s), expectedResult);
    }
    @Test
    public void check9() {
        String s= "adfaaa";
        String expectedResult = "adf3a";
        Assert.assertEquals(lineEncoding.lineEncoding(s), expectedResult);
    }
    @Test
    public void check10() {
        String s= "bbjaadlkjdl";
        String expectedResult = "2bj2adlkjdl";
        Assert.assertEquals(lineEncoding.lineEncoding(s), expectedResult);
    }
}

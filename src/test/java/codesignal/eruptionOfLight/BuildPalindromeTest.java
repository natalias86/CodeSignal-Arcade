package codesignal.eruptionOfLight;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BuildPalindromeTest {
    public BuildPalindrome buildPalindrome;

    @Before
    public void setUp() {
        buildPalindrome = new BuildPalindrome();
    }
    @Test
    public void check() {
        String st = "abcdc";
        String expectedResult = "abcdcba";
        Assert.assertEquals(buildPalindrome.buildPalindrome(st), expectedResult);
    }
    @Test
    public void check2() {
        String st = "ababab";
        String expectedResult = "abababa";
        Assert.assertEquals(buildPalindrome.buildPalindrome(st), expectedResult);
    }
    @Test
    public void check3() {
        String st = "abba";
        String expectedResult = "abba";
        Assert.assertEquals(buildPalindrome.buildPalindrome(st), expectedResult);
    }
    @Test
    public void check4() {
        String st = "abaa";
        String expectedResult = "abaaba";
        Assert.assertEquals(buildPalindrome.buildPalindrome(st), expectedResult);
    }
    @Test
    public void check5() {
        String st = "aaaaba";
        String expectedResult = "aaaabaaaa";
        Assert.assertEquals(buildPalindrome.buildPalindrome(st), expectedResult);
    }
    @Test
    public void check6() {
        String st = "abc";
        String expectedResult = "abcba";
        Assert.assertEquals(buildPalindrome.buildPalindrome(st), expectedResult);
    }
    @Test
    public void check7() {
        String st = "kebab";
        String expectedResult = "kebabek";
        Assert.assertEquals(buildPalindrome.buildPalindrome(st), expectedResult);
    }
    @Test
    public void check8() {
        String st = "abccba";
        String expectedResult = "abccba";
        Assert.assertEquals(buildPalindrome.buildPalindrome(st), expectedResult);
    }
    @Test
    public void check9() {
        String st = "abcabc";
        String expectedResult = "abcabcbacba";
        Assert.assertEquals(buildPalindrome.buildPalindrome(st), expectedResult);
    }
    @Test
    public void check10() {
        String st = "cbdbedffcg";
        String expectedResult = "cbdbedffcgcffdebdbc";
        Assert.assertEquals(buildPalindrome.buildPalindrome(st), expectedResult);
    }
    @Test
    public void check11() {
        String st = "euotmn";
        String expectedResult = "euotmnmtoue";
        Assert.assertEquals(buildPalindrome.buildPalindrome(st), expectedResult);
    }
}

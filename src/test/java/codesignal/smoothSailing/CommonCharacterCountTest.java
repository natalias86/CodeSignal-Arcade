package codesignal.smoothSailing;

import codesignal.edgeOfTheOcean.ShapeArea;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CommonCharacterCountTest {
    public CommonCharacterCount commonCharacterCountObj;

    @Before
    public void setUp() {
        commonCharacterCountObj = new CommonCharacterCount();
    }
    @Test
    public void  check(){
        String s1= "aabcc";
        String s2= "adcaa";
        int expectedResult=3;
        Assert.assertEquals(commonCharacterCountObj.commonCharacterCount(s1,s2),expectedResult);
    }
    @Test
    public void  check2(){
        String s1= "abca";
        String s2= "xyzbac";
        int expectedResult=3;
        Assert.assertEquals(commonCharacterCountObj.commonCharacterCount(s1,s2),expectedResult);
    }
    @Test
    public void  check3(){
        String s1= "a";
        String s2= "b";
        int expectedResult=0;
        Assert.assertEquals(commonCharacterCountObj.commonCharacterCount(s1,s2),expectedResult);
    }
    @Test
    public void  check4(){
        String s1= "a";
        String s2= "aaa";
        int expectedResult=1;
        Assert.assertEquals(commonCharacterCountObj.commonCharacterCount(s1,s2),expectedResult);
    }
    @Test
    public void  check5(){
        String s1= "zzzz";
        String s2= "zzzzzzz";
        int expectedResult=4;
        Assert.assertEquals(commonCharacterCountObj.commonCharacterCount(s1,s2),expectedResult);
    }
}

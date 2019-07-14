package codesignal.exploringTheWater;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AddBorderTest {


    public AddBorder addBorder;

    @Before
    public void setUp() {
        addBorder = new AddBorder();
    }
    @Test
    public void  check(){
        String[] picture = {"abc","ded"};
        String[] expectedResult= {"*****",
                                    "*abc*",
                                    "*ded*",
                                    "*****"};
        Assert.assertArrayEquals(addBorder.addBorder(picture),expectedResult);
    }
    @Test
    public void  check2(){
        String[] picture = {"a"};
        String[] expectedResult= {"***",
                "*a*",
                "***"};
        Assert.assertArrayEquals(addBorder.addBorder(picture),expectedResult);
    }
    @Test
    public void  check3(){
        String[] picture = {"aa",
                "**",
                "zz"};
        String[] expectedResult= {"****",
                "*aa*",
                "****",
                "*zz*",
                "****"};
        Assert.assertArrayEquals(addBorder.addBorder(picture),expectedResult);
    }
    @Test
    public void  check4(){
        String[] picture = {"abcde",
                "fghij",
                "klmno",
                "pqrst",
                "uvwxy"};
        String[] expectedResult= {"*******",
                "*abcde*",
                "*fghij*",
                "*klmno*",
                "*pqrst*",
                "*uvwxy*",
                "*******"};
        Assert.assertArrayEquals(addBorder.addBorder(picture),expectedResult);
    }
    @Test
    public void  check5(){
        String[] picture = {"wzy**"};
        String[] expectedResult= {"*******",
                "*wzy***",
                "*******"};
        Assert.assertArrayEquals(addBorder.addBorder(picture),expectedResult);
    }
}

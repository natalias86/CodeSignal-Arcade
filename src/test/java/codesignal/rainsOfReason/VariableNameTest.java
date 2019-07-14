package codesignal.rainsOfReason;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class VariableNameTest {
    public VariableName variableName;

    @Before
    public void setUp() {
        variableName = new VariableName();
    }
    @Test
    public void check(){
        String name="var_1__Int";
        Assert.assertTrue(variableName.variableName(name));
    }
    @Test
    public void check2(){
        String name="qq-q";
        Assert.assertFalse(variableName.variableName(name));
    }
    @Test
    public void check3(){
        String name="2w2";
        Assert.assertFalse(variableName.variableName(name));
    }
    @Test
    public void check4(){
        String name=" variable";
        Assert.assertFalse(variableName.variableName(name));
    }
    @Test
    public void check5(){
        String name="va[riable0";
        Assert.assertFalse(variableName.variableName(name));
    }
    @Test
    public void check6(){
        String name="variable0";
        Assert.assertTrue(variableName.variableName(name));
    }
    @Test
    public void check7(){
        String name="a";
        Assert.assertTrue(variableName.variableName(name));
    }
    @Test
    public void check8(){
        String name="_Aas_23";
        Assert.assertTrue(variableName.variableName(name));
    }
    @Test
    public void check9(){
        String name="a a_2";
        Assert.assertFalse(variableName.variableName(name));
    }
    @Test
    public void check10(){
        String name="0ss";
        Assert.assertFalse(variableName.variableName(name));
    }
}

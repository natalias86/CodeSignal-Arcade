package codesignal.edgeOfTheOcean;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MakeArrayConsecutive2Test {
    public MakeArrayConsecutive2 makeArrayConsecutive2Obj;

    @Before
    public void setUp() {
        makeArrayConsecutive2Obj = new MakeArrayConsecutive2();
    }
    @Test
    public void  check(){
        int[] inputArray={6, 2, 3, 8};
        int expectedResult=3;
        Assert.assertEquals(makeArrayConsecutive2Obj.makeArrayConsecutive2(inputArray),expectedResult);
    }
    @Test
    public void  check2(){
        int[] inputArray={0,3};
        int expectedResult=2;
        Assert.assertEquals(makeArrayConsecutive2Obj.makeArrayConsecutive2(inputArray),expectedResult);
    }
    @Test
    public void  check3(){
        int[] inputArray={5, 4, 6};
        int expectedResult=0;
        Assert.assertEquals(makeArrayConsecutive2Obj.makeArrayConsecutive2(inputArray),expectedResult);
    }
    @Test
    public void  check4(){
        int[] inputArray={6, 3};
        int expectedResult=2;
        Assert.assertEquals(makeArrayConsecutive2Obj.makeArrayConsecutive2(inputArray),expectedResult);
    }
    @Test
    public void  check5(){
        int[] inputArray={1};
        int expectedResult=0;
        Assert.assertEquals(makeArrayConsecutive2Obj.makeArrayConsecutive2(inputArray),expectedResult);
    }
}

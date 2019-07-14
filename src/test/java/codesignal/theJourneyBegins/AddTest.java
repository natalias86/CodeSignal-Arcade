package codesignal.theJourneyBegins;

import codesignal.landOfLogic.FileNaming;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AddTest {

    public Add addObj;

    @Before
    public void setUp() {
        addObj = new Add();
    }
    @Test
    public void  check(){
        int param1 = 1;
        int param2 = 2;
        int expectedResult=3;
        Assert.assertEquals(addObj.add(param1,param2),expectedResult);

    }
    @Test
    public void  check2(){
        int param1 = 99;
        int param2 = 100;
        int expectedResult=199;
        Assert.assertEquals(addObj.add(param1,param2),expectedResult);

    }

}

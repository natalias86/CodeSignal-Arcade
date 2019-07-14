package codesignal.landOfLogic;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FileNamingTest {

  public FileNaming filenamingObj;

    @Before
    public void setUp() {
       filenamingObj = new FileNaming();
    }
    @Test
    public void  check(){
    String[] names = {"doc", "doc", "image", "doc(1)", "doc"};
    String[] expectedResult= {"doc","doc(1)","image","doc(1)(1)","doc(2)"};
        Assert.assertArrayEquals(filenamingObj.fileNaming(names),expectedResult);

    }
  @Test
  public void  check2(){
    String[] names = {"a(1)", "a(6)", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a"};
    String[] expectedResult= {"a(1)", "a(6)","a","a(2)","a(3)","a(4)", "a(5)","a(7)","a(8)","a(9)","a(10)","a(11)"};
    Assert.assertArrayEquals(filenamingObj.fileNaming(names),expectedResult);

  }

}



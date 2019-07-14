package codesignal.eruptionOfLight;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FindEmailDomainTest {
    public FindEmailDomain findEmailDomain;

    @Before
    public void setUp() {
        findEmailDomain = new FindEmailDomain();
    }
    @Test
    public void check() {
        String address = "prettyandsimple@example.com";
        String expectedResult = "example.com";
        Assert.assertEquals(findEmailDomain.findEmailDomain(address), expectedResult);
    }
    @Test
    public void check2() {
        String address = "fully-qualified-domain@codesignal.com";
        String expectedResult = "codesignal.com";
        Assert.assertEquals(findEmailDomain.findEmailDomain(address), expectedResult);
    }
    @Test
    public void check3() {
        String address = "\" \"@space.com";
        String expectedResult = "space.com";
        Assert.assertEquals(findEmailDomain.findEmailDomain(address), expectedResult);
    }
    @Test
    public void check4() {
        String address = "someaddress@yandex.ru";
        String expectedResult = "yandex.ru";
        Assert.assertEquals(findEmailDomain.findEmailDomain(address), expectedResult);
    }
    @Test
    public void check5() {
        String address = "\" \"@xample.org";
        String expectedResult = "xample.org";
        Assert.assertEquals(findEmailDomain.findEmailDomain(address), expectedResult);
    }
    @Test
    public void check6() {
        String address = "\"much.more unusual\"@yahoo.com";
        String expectedResult = "yahoo.com";
        Assert.assertEquals(findEmailDomain.findEmailDomain(address), expectedResult);
    }
    @Test
    public void check7() {
        String address = "\"very.unusual.@.unusual.com\"@usual.com";
        String expectedResult = "usual.com";
        Assert.assertEquals(findEmailDomain.findEmailDomain(address), expectedResult);
    }
    @Test
    public void check8() {
        String address =  "admin@mailserver2.ru";
        String expectedResult = "mailserver2.ru";
        Assert.assertEquals(findEmailDomain.findEmailDomain(address), expectedResult);
    }
    @Test
    public void check9() {
        String address = "example-indeed@strange-example.com";
        String expectedResult = "strange-example.com";
        Assert.assertEquals(findEmailDomain.findEmailDomain(address), expectedResult);
    }
    @Test
    public void check10() {
        String address = "very.common@gmail.com";
        String expectedResult = "gmail.com";
        Assert.assertEquals(findEmailDomain.findEmailDomain(address), expectedResult);
    }
}

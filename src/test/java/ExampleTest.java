import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class ExampleTest {

    private Example o;

    @Before
    public void setUp() {
        o = new Example();
    }

    @Test
    public void test_home_function_testCase1() {
        Assert.assertEquals("Hello World!", o.home());
    }

}



import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TestMain.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TestMain
{
  public static void main(String args[]) {
    TestMain test = new TestMain();
    test.testTest();
  }
    /**
     * Default constructor for test class TestMain
     */
    public TestMain()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    @Test
    public  void testTest() {
        Main main = new Main();
        assertEquals(5, main.test());
    }
    
    
    
}

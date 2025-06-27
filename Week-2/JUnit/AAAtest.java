import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class AAAtest {
    private sum s;
    // Arrange
    @Before
    public void setUp() {
        System.out.println("Setting up");
        s = new sum();
    }

    // Teardown
    @After
    public void tearDown() {
        System.out.println("Tearing down");
        s = null;
    }
  
    @Test
    public void testAddition() {        
        int result = s.sumOf(3);
        assertEquals(6, result);
    }
}


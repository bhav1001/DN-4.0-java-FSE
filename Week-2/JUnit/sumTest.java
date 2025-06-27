import org.junit.Test;
import static org.junit.Assert.*;

public class sumTest {
    @Test
    public void testSumOf(){
        sum s= new sum();
        assertEquals(10, s.sumOf(4));
    }
}
